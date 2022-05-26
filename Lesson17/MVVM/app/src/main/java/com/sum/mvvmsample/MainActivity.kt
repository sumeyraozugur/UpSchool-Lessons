package com.sum.mvvmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.sum.mvvmsample.presentation.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val weatherViewModel:WeatherViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = weatherViewModel.getWeather("Gaziantep","1b45ce95c85f49f489fd96cc081c71c7")

      data.observe(this, Observer {
            Log.v("AKBANK",data.value.toString())
        })
    }
}