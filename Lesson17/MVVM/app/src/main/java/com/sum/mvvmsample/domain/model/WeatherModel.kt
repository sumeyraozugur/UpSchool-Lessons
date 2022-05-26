package com.sum.mvvmsample.domain.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WeatherModel {
    data class WeatherModel(
        @SerializedName("count")
        @Expose
        val count: Int,

        @SerializedName("data")
        @Expose
        val data: List<Data>
    )
}