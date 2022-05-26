package com.sum.mvvmsample.presentation

import android.location.Location
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.sum.mvvmsample.domain.model.WeatherModel
import com.sum.mvvmsample.domain.usecase.WeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherUseCase: WeatherUseCase,

) : ViewModel() {


    fun getWeather(city: String,key:String): LiveData<WeatherModel> {
        weatherUseCase.getWeather(city,key)
        return weatherUseCase.getCurrenWeather
    }



}