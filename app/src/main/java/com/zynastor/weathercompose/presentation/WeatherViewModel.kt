package com.zynastor.weathercompose.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zynastor.weathercompose.domain.location.LocationTracker
import com.zynastor.weathercompose.domain.repository.WeatherRepository
import com.zynastor.weathercompose.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val locationTracker: LocationTracker
) : ViewModel() {
    var state by mutableStateOf(WeatherState())
        private set

    fun loadWeatherInfo() {
        viewModelScope.launch {
            state=state.copy(
                isLoading = true, error = null
            )
            locationTracker.getCurrentLocation()?.let { location->
                when(val result=repository.getWeatherData(location.latitude,location.longitude)){
                    is Resource.Success->{

                    }
                }
            }
        }
    }
}