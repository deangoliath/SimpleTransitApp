package com.example.wmata

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

// --- Data models ---
@JsonClass(generateAdapter = true)
data class NextBusPredictionsResponse(
  @Json(name = "StopName")      val stopName: String,
  @Json(name = "Predictions")   val predictions: List<NextBusPrediction>
)

@JsonClass(generateAdapter = true)
data class NextBusPrediction(
  @Json(name = "RouteID")       val routeId: String,
  @Json(name = "DirectionText") val directionText: String,
  @Json(name = "DirectionNum")  val directionNum: String,
  @Json(name = "Minutes")       val minutes: Int,
  @Json(name = "VehicleID")     val vehicleId: String?,
  @Json(name = "TripID")        val tripId: String
)


// --- Retrofit service interface ---
interface WmataService {
  @GET("NextBusService.svc/json/jPredictions")
  suspend fun getBusPredictions(
    @Header("api_key") apiKey: String,
    @Query("StopID")   stopId: String
  ): NextBusPredictionsResponse

@GET("Bus.svc/json/jStops")
suspend fun getNearbyStops(
  @Header("api_key") apiKey: String,
  @Query("Lat")     lat: Double,
  @Query("Lon")     lon: Double,
  @Query("Radius")  radius: Int
): NearbyStopsResponse

  
  // 4) New data classes for the “nearby stops” reply
@JsonClass(generateAdapter = true)
data class NearbyStopsResponse(
  @Json(name="Stops") val stops: List<Stop>
)

@JsonClass(generateAdapter = true)
data class Stop(
  @Json(name="StopID") val stopId: String,
  @Json(name="Name")   val name:   String,
  @Json(name="Lat")    val lat:    Double,
  @Json(name="Lon")    val lon:    Double
)

}

// --- Retrofit client helper ---
object WmataClient {
  private const val BASE_URL = "https://api.wmata.com/"

  private val moshi: Moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val logging = HttpLoggingInterceptor { msg ->
  android.util.Log.d("WMATA-HTTP", msg)
}.apply {
  level = HttpLoggingInterceptor.Level.BODY
}

// 2) Then build your OkHttpClient with that interceptor
private val httpClient = OkHttpClient.Builder()
  .addInterceptor(logging)
  .build()


  val service: WmataService by lazy {
    Retrofit.Builder()
      .baseUrl(BASE_URL)
      .client(httpClient)
      .addConverterFactory(MoshiConverterFactory.create(moshi))
      .build()
      .create(WmataService::class.java)
  }
}