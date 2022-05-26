package com.sum.mvvmsample.domain.repository

import androidx.lifecycle.MutableLiveData
import com.sum.mvvmsample.domain.model.WeatherModel
import retrofit2.Call


interface WeatherRepository {
    fun getCurrent(city: String, key: String): Call<WeatherModel>

}
