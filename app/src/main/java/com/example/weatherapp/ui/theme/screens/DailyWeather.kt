package com.example.weatherapp.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R
import com.example.weatherapp.models.Daily

@Composable
fun DailyWeather() {

    val day1 = Daily(
        date = "Sunday, Oct 11th",
        description = "Cloudy",
        highTemp = 10,
        lowTemp = 5,
        highWindSpd = 20,
        lowWindSpd = 15,
        humidity = 50,
        precipitationChance = 20,
        precipitationAmount = 0.01,
        resourceId = R.drawable.weathercloudy
    )

    val day2 = Daily(
        date = "Monday, Oct 12th",
        description = "Light Rain",
        highTemp = 5,
        lowTemp = 1,
        highWindSpd = 10,
        lowWindSpd = 2,
        humidity = 30,
        precipitationChance = 97,
        precipitationAmount = 1.5,
        resourceId = R.drawable.weatherlightrain
    )

    val day3 = Daily(
        date = "Tuesday, Oct 13th",
        description = "Foggy",
        highTemp = 3,
        lowTemp = -2,
        highWindSpd = 2,
        lowWindSpd = 1,
        humidity = 90,
        precipitationChance = 10,
        precipitationAmount = 0.03,
        resourceId = R.drawable.weatherfoggy
    )

    val scrollState = rememberScrollState()

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(vertical = 20.dp))
    {
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .height(200.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.tertiary
            )

        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(text = day1.date)
                Image(
                    painter = painterResource(id = day1.resourceId),
                    contentDescription = day1.description
                )
                Text(text = day1.description)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "High " + day1.highTemp + "℃")
                    Text(text = "Low " + day1.lowTemp + "℃")
                    Text(text = "Humidity " + day1.humidity + "%")
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Max Wind Speed " + day1.highWindSpd + "kph",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Min Wind Speed " + day1.lowWindSpd + "kph",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Precipitation Chance " + day1.precipitationChance + "%",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Expected Amount " + day1.precipitationAmount + "mm",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .height(200.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.tertiary
            )

        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(text = day2.date)
                Image(
                    painter = painterResource(id = day2.resourceId),
                    contentDescription = day2.description
                )
                Text(text = day2.description)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "High " + day2.highTemp + "℃")
                    Text(text = "Low " + day2.lowTemp + "℃")
                    Text(text = "Humidity " + day2.humidity + "%")
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Max Wind Speed " + day2.highWindSpd + "kph",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Min Wind Speed " + day2.lowWindSpd + "kph",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Precipitation Chance " + day2.precipitationChance + "%",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Expected Amount " + day2.precipitationAmount + "mm",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
                .height(200.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.tertiary
            )

        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(text = day3.date)
                Image(
                    painter = painterResource(id = day3.resourceId),
                    contentDescription = day3.description
                )
                Text(text = day2.description)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(text = "High " + day3.highTemp + "℃")
                    Text(text = "Low " + day3.lowTemp + "℃")
                    Text(text = "Humidity " + day3.humidity + "%")
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Max Wind Speed " + day3.highWindSpd + "kph",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Min Wind Speed " + day3.lowWindSpd + "kph",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Precipitation Chance " + day3.precipitationChance + "%",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Expected Amount " + day3.precipitationAmount + "mm",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}