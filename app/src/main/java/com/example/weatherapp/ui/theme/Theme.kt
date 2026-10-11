package com.example.weatherapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = WarmOrange,
    secondary = NavDark,
    tertiary = CardDark,
    background = DarkModeBackground,
    onBackground = WarmOrange,
    surface = Black,
    primaryContainer = Black,
    onSurface = WarmOrange,
    onSecondary = ColdBlue,
    onTertiary = ColdBlue
)

private val LightColorScheme = lightColorScheme(
    primary = ColdBlue,
    secondary = NavLight,
    tertiary = CardLight,
    background = White,
    surface = White,
    onBackground = WarmOrange,
    onSurface = WarmOrange,
    onSecondary = ColderBlue,
    onTertiary = ColderBlue
)

val warmGradientColors = listOf(WarmYellow, WarmOrange, WarmRed)

val coldGradientColors = listOf(ColdBlue, ColderBlue, ColdestBlue)


@Composable
fun WeatherAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}