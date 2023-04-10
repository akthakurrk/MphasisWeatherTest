package com.example.mphasisweatherdemo.repository

import com.example.mphasisweatherdemo.networks.RetroServices
import javax.inject.Inject

class MainRepository @Inject constructor(private val retroService: RetroServices) {

    suspend fun getWeatherAPI(
        cityName: String,
        limit: String,
        appId: String
    ) = retroService.getWeather(cityName, limit, appId)
}