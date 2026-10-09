package com.example.weatherapp.models

data class CurrentWeath(
    val currentTemp: Int,
    val description: String,
    val windSpd: Int,
    val windDir: String,
    val humidity: Int,
    val tempFeel: Int,
)