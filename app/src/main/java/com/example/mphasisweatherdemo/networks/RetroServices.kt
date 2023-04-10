package com.example.mphasisweatherdemo.networks

import com.example.mphasisweatherdemo.models.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServices {


    @GET(APIEndPoints.weather)
    suspend fun getWeather(
        @Query(Keys.q) cityName: String,
        @Query(Keys.limit) limit: String,
        @Query(Keys.appid) appId: String
    ): WeatherModel

}