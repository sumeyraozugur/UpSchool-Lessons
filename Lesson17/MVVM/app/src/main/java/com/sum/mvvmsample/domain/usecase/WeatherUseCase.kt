package com.sum.mvvmsample.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sum.mvvmsample.domain.model.WeatherModel
import com.sum.mvvmsample.domain.repository.WeatherRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {

    private var getCurrenWeatherTemp = MutableLiveData<WeatherModel>()
    val getCurrenWeather: LiveData<WeatherModel> = getCurrenWeatherTemp

    fun getWeather(city: String,key:String) {
        weatherRepository.getCurrent(city, key).enqueue(object : Callback<WeatherModel> {
            override fun onResponse(call: Call<WeatherModel>, response: Response<WeatherModel>) {
                getCurrenWeatherTemp.value = response.body()
            }

            override fun onFailure(call: Call<WeatherModel>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })

    }


}