package com.zynastor.weathercompose.domain.repository

import com.zynastor.weathercompose.domain.util.Resource
import com.zynastor.weathercompose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}