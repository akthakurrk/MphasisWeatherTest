package com.example.mphasisweatherdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0003J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/mphasisweatherdemo/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/mphasisweatherdemo/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/mphasisweatherdemo/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/mphasisweatherdemo/databinding/ActivityMainBinding;)V", "sharePre", "Lcom/example/mphasisweatherdemo/utility/SharePreferences;", "viewModel", "Lcom/example/mphasisweatherdemo/viewmodels/MainViewModel;", "getViewModel", "()Lcom/example/mphasisweatherdemo/viewmodels/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getWeatherAPI", "", "cityName", "", "limit", "appId", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.mphasisweatherdemo.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.mphasisweatherdemo.utility.SharePreferences sharePre;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mphasisweatherdemo.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.mphasisweatherdemo.databinding.ActivityMainBinding p0) {
    }
    
    private final com.example.mphasisweatherdemo.viewmodels.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void getWeatherAPI(java.lang.String cityName, java.lang.String limit, java.lang.String appId) {
    }
}