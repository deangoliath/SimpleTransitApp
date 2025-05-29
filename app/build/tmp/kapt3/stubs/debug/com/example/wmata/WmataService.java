package com.example.wmata;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0010\u0011J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J9\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/wmata/WmataService;", "", "getBusPredictions", "Lcom/example/wmata/NextBusPredictionsResponse;", "apiKey", "", "stopId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearbyStops", "Lcom/example/wmata/WmataService$NearbyStopsResponse;", "lat", "", "lon", "radius", "", "(Ljava/lang/String;DDILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NearbyStopsResponse", "Stop", "app_debug"})
public abstract interface WmataService {
    
    @retrofit2.http.GET(value = "NextBusService.svc/json/jPredictions")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBusPredictions(@retrofit2.http.Header(value = "api_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Query(value = "StopID")
    @org.jetbrains.annotations.NotNull
    java.lang.String stopId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wmata.NextBusPredictionsResponse> $completion);
    
    @retrofit2.http.GET(value = "Bus.svc/json/jStops")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNearbyStops(@retrofit2.http.Header(value = "api_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Query(value = "Lat")
    double lat, @retrofit2.http.Query(value = "Lon")
    double lon, @retrofit2.http.Query(value = "Radius")
    int radius, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wmata.WmataService.NearbyStopsResponse> $completion);
    
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/wmata/WmataService$NearbyStopsResponse;", "", "stops", "", "Lcom/example/wmata/WmataService$Stop;", "(Ljava/util/List;)V", "getStops", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class NearbyStopsResponse {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.example.wmata.WmataService.Stop> stops = null;
        
        public NearbyStopsResponse(@com.squareup.moshi.Json(name = "Stops")
        @org.jetbrains.annotations.NotNull
        java.util.List<com.example.wmata.WmataService.Stop> stops) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.wmata.WmataService.Stop> getStops() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.wmata.WmataService.Stop> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wmata.WmataService.NearbyStopsResponse copy(@com.squareup.moshi.Json(name = "Stops")
        @org.jetbrains.annotations.NotNull
        java.util.List<com.example.wmata.WmataService.Stop> stops) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @com.squareup.moshi.JsonClass(generateAdapter = true)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/example/wmata/WmataService$Stop;", "", "stopId", "", "name", "lat", "", "lon", "(Ljava/lang/String;Ljava/lang/String;DD)V", "getLat", "()D", "getLon", "getName", "()Ljava/lang/String;", "getStopId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Stop {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String stopId = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final double lat = 0.0;
        private final double lon = 0.0;
        
        public Stop(@com.squareup.moshi.Json(name = "StopID")
        @org.jetbrains.annotations.NotNull
        java.lang.String stopId, @com.squareup.moshi.Json(name = "Name")
        @org.jetbrains.annotations.NotNull
        java.lang.String name, @com.squareup.moshi.Json(name = "Lat")
        double lat, @com.squareup.moshi.Json(name = "Lon")
        double lon) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStopId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final double getLat() {
            return 0.0;
        }
        
        public final double getLon() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final double component4() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wmata.WmataService.Stop copy(@com.squareup.moshi.Json(name = "StopID")
        @org.jetbrains.annotations.NotNull
        java.lang.String stopId, @com.squareup.moshi.Json(name = "Name")
        @org.jetbrains.annotations.NotNull
        java.lang.String name, @com.squareup.moshi.Json(name = "Lat")
        double lat, @com.squareup.moshi.Json(name = "Lon")
        double lon) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}