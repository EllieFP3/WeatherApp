package com.example.weatherapp.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.weatherapp.models.CurrentWeath
import com.example.weatherapp.ui.theme.warmGradientColors

@Composable
fun CurrentWeather() {

    val currentWeath = CurrentWeath(
        description = "Sunny",
        currentTemp = 21,
        windSpd = 15,
        windDir = "W",
        humidity = 75,
        tempFeel = 23
    )
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = currentWeath.description,
            style = MaterialTheme.typography.headlineMedium)
        Text(text = currentWeath.currentTemp.toString() + "℃",
            style = MaterialTheme.typography.headlineLarge)
        Row(
            horizontalArrangement =  Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Wind " + currentWeath.windDir)
            Text(text = currentWeath.windSpd.toString() + " kph")
        }
        Text(text = "Humidity " + currentWeath.humidity.toString())
        Text(text = "Feels like " + currentWeath.tempFeel.toString() + "℃")
    }
}