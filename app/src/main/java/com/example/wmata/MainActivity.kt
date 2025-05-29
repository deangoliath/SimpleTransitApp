package com.example.wmata

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

import org.osmdroid.bonuspack.clustering.RadiusMarkerClusterer
import org.osmdroid.config.Configuration
import org.osmdroid.events.MapListener
import org.osmdroid.events.ScrollEvent
import org.osmdroid.events.ZoomEvent
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker

class MainActivity : AppCompatActivity() {

  private lateinit var map: MapView
  private lateinit var stopClusterer: RadiusMarkerClusterer
  private val apiKey = "827e9b286e074e878f2f96adc2921be2"

  // 1) Job to debounce reloads
  private var clusterJob: Job? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // Osmdroid setup
    Configuration.getInstance().userAgentValue = packageName
    Configuration.getInstance()
      .load(this, getSharedPreferences("osmdroid", MODE_PRIVATE))

    setContentView(R.layout.activity_main)

    // Find & configure MapView
    map = findViewById<MapView>(R.id.map).apply {
      setTileSource(TileSourceFactory.MAPNIK)
      setMultiTouchControls(true)
      controller.setCenter(GeoPoint(38.89708333, -76.99602778))
      controller.setZoom(16.0)

    }

    // Create clusterer and add to overlays
    stopClusterer = RadiusMarkerClusterer(this).apply {
      setRadius(100)
      val drawable = ContextCompat.getDrawable(
        this@MainActivity,
        R.drawable.marker_cluster
      )!!
      setIcon(drawableToBitmap(drawable))
      textPaint.textSize = 24f
      map.overlays.add(this)
    }

    // Debounced reload on pan/zoom
    map.addMapListener(object : MapListener {
      override fun onScroll(ev: ScrollEvent?) = scheduleCluster()
      override fun onZoom(ev: ZoomEvent?)   = scheduleCluster()
    })

    // Initial load
    map.post {
    loadAndClusterStops()
    }
  }

  /** Debounce helper: wait 500ms since last pan/zoom before reloading */
  private fun scheduleCluster(): Boolean {
    clusterJob?.cancel()
    clusterJob = lifecycleScope.launch {
      delay(500)
      loadAndClusterStops()
    }
    return true
  }

  /** Core: fetch nearby stops, build & cluster markers */
  private fun loadAndClusterStops() {
    Log.d("WMATA-CLUSTER",
      "⟳ loadAndClusterStops() called (old=${stopClusterer.items.size})")

    // 1) clear old markers
    stopClusterer.items.clear()

    // 2) get center
    val center = map.mapCenter as GeoPoint
    Log.d("WMATA-CLUSTER", "   center=${center.latitude},${center.longitude}")

    // 3) fetch & cluster
    lifecycleScope.launch {
      try {
        val radiusMeters = (0.25 * 1609).roundToInt()
        val resp = WmataClient.service.getNearbyStops(
          apiKey,
          center.latitude,
          center.longitude,
          radiusMeters 
         )
        Log.d("WMATA-CLUSTER", "   fetched=${resp.stops.size}")

        resp.stops.forEach { stop ->
          Marker(map).apply {
            position = GeoPoint(stop.lat, stop.lon)
            title    = stop.name
            snippet  = stop.stopId
            setOnMarkerClickListener { marker, _ ->
              lifecycleScope.launch {
                try {
                  val arrivals = WmataClient.service
                    .getBusPredictions(apiKey, marker.snippet!!)
                    .predictions.take(2)
                  marker.snippet = arrivals.joinToString("\n") {
                    "Bus ${it.routeId} ${it.directionText}: ${it.minutes} min"
                  }
                  marker.showInfoWindow()
                } catch (e: Exception) {
                  Toast.makeText(
                    this@MainActivity,
                    "Failed to load arrivals",
                    Toast.LENGTH_SHORT
                  ).show()
                }
              }
              true
            }
          }.also { stopClusterer.add(it) }
        }

        // 4) redraw
        map.invalidate()

      } catch (e: Exception) {
        Log.e("WMATA-CLUSTER", "error loading stops", e)
        Toast.makeText(
          this@MainActivity,
          "Could not load nearby stops",
          Toast.LENGTH_SHORT
        ).show()
      }
    }
  }

  /** Utility to turn any Drawable into a Bitmap for cluster icons */
  private fun drawableToBitmap(drawable: Drawable): Bitmap {
    if (drawable is BitmapDrawable) {
      return drawable.bitmap
    }
    val width  = drawable.intrinsicWidth.takeIf { it > 0 }  ?: 64
    val height = drawable.intrinsicHeight.takeIf { it > 0 } ?: 64
    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    Canvas(bitmap).also {
      drawable.setBounds(0, 0, it.width, it.height)
      drawable.draw(it)
    }
    return bitmap
  }

  override fun onResume() {
    super.onResume()
    map.onResume()
  }

  override fun onPause() {
    map.onPause()
    super.onPause()
  }
}
