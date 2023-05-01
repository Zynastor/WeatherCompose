package com.zynastor.weathercompose.data.repository

import com.zynastor.weathercompose.data.mappers.toWeatherInfo
import com.zynastor.weathercompose.data.remote.WeatherApi
import com.zynastor.weathercompose.domain.repository.WeatherRepository
import com.zynastor.weathercompose.domain.util.Resource
import com.zynastor.weathercompose.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeather(lat, long).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}