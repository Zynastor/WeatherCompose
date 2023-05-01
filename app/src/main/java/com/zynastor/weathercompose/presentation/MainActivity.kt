package com.zynastor.weathercompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.zynastor.weathercompose.presentation.ui.theme.WeatherComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherComposeTheme {
            }
        }
    }
}