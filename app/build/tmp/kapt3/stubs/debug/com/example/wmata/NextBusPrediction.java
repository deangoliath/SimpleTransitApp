package com.example.wmata;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/example/wmata/NextBusPrediction;", "", "routeId", "", "directionText", "directionNum", "minutes", "", "vehicleId", "tripId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDirectionNum", "()Ljava/lang/String;", "getDirectionText", "getMinutes", "()I", "getRouteId", "getTripId", "getVehicleId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class NextBusPrediction {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String routeId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String directionText = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String directionNum = null;
    private final int minutes = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String vehicleId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tripId = null;
    
    public NextBusPrediction(@com.squareup.moshi.Json(name = "RouteID")
    @org.jetbrains.annotations.NotNull
    java.lang.String routeId, @com.squareup.moshi.Json(name = "DirectionText")
    @org.jetbrains.annotations.NotNull
    java.lang.String directionText, @com.squareup.moshi.Json(name = "DirectionNum")
    @org.jetbrains.annotations.NotNull
    java.lang.String directionNum, @com.squareup.moshi.Json(name = "Minutes")
    int minutes, @com.squareup.moshi.Json(name = "VehicleID")
    @org.jetbrains.annotations.Nullable
    java.lang.String vehicleId, @com.squareup.moshi.Json(name = "TripID")
    @org.jetbrains.annotations.NotNull
    java.lang.String tripId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRouteId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDirectionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDirectionNum() {
        return null;
    }
    
    public final int getMinutes() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVehicleId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTripId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.wmata.NextBusPrediction copy(@com.squareup.moshi.Json(name = "RouteID")
    @org.jetbrains.annotations.NotNull
    java.lang.String routeId, @com.squareup.moshi.Json(name = "DirectionText")
    @org.jetbrains.annotations.NotNull
    java.lang.String directionText, @com.squareup.moshi.Json(name = "DirectionNum")
    @org.jetbrains.annotations.NotNull
    java.lang.String directionNum, @com.squareup.moshi.Json(name = "Minutes")
    int minutes, @com.squareup.moshi.Json(name = "VehicleID")
    @org.jetbrains.annotations.Nullable
    java.lang.String vehicleId, @com.squareup.moshi.Json(name = "TripID")
    @org.jetbrains.annotations.NotNull
    java.lang.String tripId) {
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