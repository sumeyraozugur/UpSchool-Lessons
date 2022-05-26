package com.sum.mvvmsample.data.repository

import com.sum.mvvmsample.data.source.remote.ApiService
import com.sum.mvvmsample.domain.model.WeatherModel
import com.sum.mvvmsample.domain.repository.WeatherRepository
import retrofit2.Call

class WeatherRepositoryImp(
    private val apiService: ApiService,
) : WeatherRepository {

    override fun getCurrent(city: String, key: String): Call<WeatherModel> {
        return apiService.getWeather(city, key)
    }


}