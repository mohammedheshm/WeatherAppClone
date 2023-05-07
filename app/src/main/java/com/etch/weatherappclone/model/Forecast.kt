package com.etch.weatherappclone.model


import com.google.gson.annotations.SerializedName

data class Forecast(
    val day: Int,
    val temperature: String,
    val wind: String,
)