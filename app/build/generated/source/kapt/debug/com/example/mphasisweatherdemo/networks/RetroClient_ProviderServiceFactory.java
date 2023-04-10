// Generated by Dagger (https://dagger.dev).
package com.example.mphasisweatherdemo.networks;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetroClient_ProviderServiceFactory implements Factory<RetroServices> {
  private final RetroClient module;

  private final Provider<Retrofit> retrofitProvider;

  public RetroClient_ProviderServiceFactory(RetroClient module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RetroServices get() {
    return ProviderService(module, retrofitProvider.get());
  }

  public static RetroClient_ProviderServiceFactory create(RetroClient module,
      Provider<Retrofit> retrofitProvider) {
    return new RetroClient_ProviderServiceFactory(module, retrofitProvider);
  }

  public static RetroServices ProviderService(RetroClient instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.ProviderService(retrofit));
  }
}
