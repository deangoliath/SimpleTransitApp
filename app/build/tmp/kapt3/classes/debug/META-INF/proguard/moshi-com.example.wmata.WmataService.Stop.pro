-if class com.example.wmata.WmataService$Stop
-keepnames class com.example.wmata.WmataService$Stop
-if class com.example.wmata.WmataService$Stop
-keep class com.example.wmata.WmataService_StopJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
