package com.example.mphasisweatherdemo.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/mphasisweatherdemo/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/mphasisweatherdemo/repository/MainRepository;", "(Lcom/example/mphasisweatherdemo/repository/MainRepository;)V", "getWeatherAPi", "Landroidx/lifecycle/LiveData;", "Lcom/example/mphasisweatherdemo/networks/Resource;", "Lcom/example/mphasisweatherdemo/models/WeatherModel;", "cityName", "", "limit", "appId", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mphasisweatherdemo.repository.MainRepository mainRepository = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mphasisweatherdemo.repository.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mphasisweatherdemo.networks.Resource<com.example.mphasisweatherdemo.models.WeatherModel>> getWeatherAPi(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    java.lang.String appId) {
        return null;
    }
}