// Generated by Dagger (https://dagger.dev).
package com.example.mphasisweatherdemo.networks;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetroClient_GetInstanceFactory implements Factory<Retrofit> {
  private final RetroClient module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public RetroClient_GetInstanceFactory(RetroClient module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return getInstance(module, okHttpClientProvider.get());
  }

  public static RetroClient_GetInstanceFactory create(RetroClient module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new RetroClient_GetInstanceFactory(module, okHttpClientProvider);
  }

  public static Retrofit getInstance(RetroClient instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.getInstance(okHttpClient));
  }
}
