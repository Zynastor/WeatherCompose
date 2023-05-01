package com.zynastor.weathercompose.di

import com.zynastor.weathercompose.data.repository.WeatherRepositoryImpl
import com.zynastor.weathercompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository

}