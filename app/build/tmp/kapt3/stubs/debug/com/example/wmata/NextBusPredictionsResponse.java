package com.example.wmata;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/wmata/NextBusPredictionsResponse;", "", "stopName", "", "predictions", "", "Lcom/example/wmata/NextBusPrediction;", "(Ljava/lang/String;Ljava/util/List;)V", "getPredictions", "()Ljava/util/List;", "getStopName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class NextBusPredictionsResponse {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String stopName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.wmata.NextBusPrediction> predictions = null;
    
    public NextBusPredictionsResponse(@com.squareup.moshi.Json(name = "StopName")
    @org.jetbrains.annotations.NotNull
    java.lang.String stopName, @com.squareup.moshi.Json(name = "Predictions")
    @org.jetbrains.annotations.NotNull
    java.util.List<com.example.wmata.NextBusPrediction> predictions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStopName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.wmata.NextBusPrediction> getPredictions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.wmata.NextBusPrediction> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.wmata.NextBusPredictionsResponse copy(@com.squareup.moshi.Json(name = "StopName")
    @org.jetbrains.annotations.NotNull
    java.lang.String stopName, @com.squareup.moshi.Json(name = "Predictions")
    @org.jetbrains.annotations.NotNull
    java.util.List<com.example.wmata.NextBusPrediction> predictions) {
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