package com.example.weatherapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R

import com.example.weatherapp.models.Current

@Composable
fun CurrentWeather() {

    val current = Current(
        description = "Sunny",
        currentTemp = 21,
        windSpd = 15,
        windDir = "W",
        humidity = 75,
        tempFeel = 23,
        resourceId = R.drawable.weathersunny
    )
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = current.resourceId),
            contentDescription = current.description,
            modifier = Modifier.size(115.dp,115.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = current.description,
            style = MaterialTheme.typography.headlineMedium)
        Text(text = current.currentTemp.toString() + "℃",
            style = MaterialTheme.typography.headlineLarge)
        Row(
            horizontalArrangement =  Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Wind " + current.windDir)
            Text(text = current.windSpd.toString() + " kph")
        }
        Text(text = "Humidity " + current.humidity + "%")
        Text(text = "Feels like " + current.tempFeel + "℃")
    }
}