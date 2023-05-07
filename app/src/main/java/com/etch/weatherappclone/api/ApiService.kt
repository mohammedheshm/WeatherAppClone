package com.etch.weatherappclone.api

import com.etch.weatherappclone.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Egypt")
    suspend fun getWeather(): Response<Weather>
}