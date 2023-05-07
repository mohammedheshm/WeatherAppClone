package com.etch.weatherappclone.Repository

import com.etch.weatherappclone.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {

    suspend fun getWeather() = apiService.getWeather()

}