package com.zynastor.weathercompose.di

import com.zynastor.weathercompose.data.location.DefaultLocationTracker
import com.zynastor.weathercompose.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {
    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker): LocationTracker
}