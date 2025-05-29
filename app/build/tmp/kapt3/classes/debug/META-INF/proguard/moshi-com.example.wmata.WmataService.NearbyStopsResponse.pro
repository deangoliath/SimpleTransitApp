-if class com.example.wmata.WmataService$NearbyStopsResponse
-keepnames class com.example.wmata.WmataService$NearbyStopsResponse
-if class com.example.wmata.WmataService$NearbyStopsResponse
-keep class com.example.wmata.WmataService_NearbyStopsResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
