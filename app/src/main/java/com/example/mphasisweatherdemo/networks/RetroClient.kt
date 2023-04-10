package com.example.mphasisweatherdemo.networks

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
class RetroClient {

    @RequiresApi(Build.VERSION_CODES.O)
    @Provides
    fun provideOkhttpClient(@ApplicationContext context: Context): OkHttpClient {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
            .connectTimeout(30 * 60 * 1000L, TimeUnit.SECONDS)
            .writeTimeout(30 * 60 * 1000L, TimeUnit.SECONDS)
            .readTimeout(30 * 60 * 1000L, TimeUnit.SECONDS).build()

    }

    @Provides
    fun getInstance(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder().baseUrl(APIEndPoints.BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient).build()

    @Provides
    fun ProviderService(retrofit: Retrofit): RetroServices = retrofit.create(RetroServices::class.java)
}
