package com.example.weatherapp.models

import com.google.gson.annotations.SerializedName

class Wind (
    @SerializedName("speed") val speed: Double,
    @SerializedName("deg") val degree: Int,
    @SerializedName("gust") val gust: Double
)
