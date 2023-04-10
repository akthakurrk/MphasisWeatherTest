package com.example.mphasisweatherdemo.viewmodels

import androidx.lifecycle.liveData
import androidx.lifecycle.ViewModel
import com.example.mphasisweatherdemo.networks.Resource
import com.example.mphasisweatherdemo.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    fun getWeatherAPi(
        cityName: String,
        limit: String,
        appId: String
    ) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getWeatherAPI(cityName, limit, appId)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Errors Occurs!"))
        }
    }
}