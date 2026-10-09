package com.example.weatherapp.models

data class DailyWeath(
    val highTemp: Int,
    val lowTemp: Int,
    val description: String,
    val highWindSpd: Int,
    val lowWindSpd: Int,
    val humidity: Int,
    val precipitationChance: Int,
    val precipitationAmount: Int,
    val snowChance: Int,
    val snowAmount: Int
)