package com.example.weatherapp.models

data class Daily(
    val date: String,
    val highTemp: Int,
    val lowTemp: Int,
    val description: String,
    val highWindSpd: Int,
    val lowWindSpd: Int,
    val humidity: Int,
    val precipitationChance: Int,
    val precipitationAmount: Double,
    val resourceId: Int
)