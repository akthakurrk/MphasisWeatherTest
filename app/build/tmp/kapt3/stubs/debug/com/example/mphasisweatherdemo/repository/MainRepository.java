package com.example.mphasisweatherdemo.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/mphasisweatherdemo/repository/MainRepository;", "", "retroService", "Lcom/example/mphasisweatherdemo/networks/RetroServices;", "(Lcom/example/mphasisweatherdemo/networks/RetroServices;)V", "getWeatherAPI", "Lcom/example/mphasisweatherdemo/models/WeatherModel;", "cityName", "", "limit", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainRepository {
    private final com.example.mphasisweatherdemo.networks.RetroServices retroService = null;
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.example.mphasisweatherdemo.networks.RetroServices retroService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String appId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.mphasisweatherdemo.models.WeatherModel> continuation) {
        return null;
    }
}