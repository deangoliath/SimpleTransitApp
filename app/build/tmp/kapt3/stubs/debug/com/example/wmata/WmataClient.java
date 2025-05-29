package com.example.wmata;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/wmata/WmataClient;", "", "()V", "BASE_URL", "", "httpClient", "Lokhttp3/OkHttpClient;", "logging", "Lokhttp3/logging/HttpLoggingInterceptor;", "moshi", "Lcom/squareup/moshi/Moshi;", "service", "Lcom/example/wmata/WmataService;", "getService", "()Lcom/example/wmata/WmataService;", "service$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class WmataClient {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE_URL = "https://api.wmata.com/";
    @org.jetbrains.annotations.NotNull
    private static final com.squareup.moshi.Moshi moshi = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.logging.HttpLoggingInterceptor logging = null;
    @org.jetbrains.annotations.NotNull
    private static final okhttp3.OkHttpClient httpClient = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy service$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.wmata.WmataClient INSTANCE = null;
    
    private WmataClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.wmata.WmataService getService() {
        return null;
    }
}