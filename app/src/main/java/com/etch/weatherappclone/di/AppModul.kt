package com.etch.weatherappclone.di

import com.etch.weatherappclone.api.ApiService
import com.etch.weatherappclone.utils.Constans
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@Module
@InstallIn(SingletonComponent::class)
object AppModul {

    @Provides
    fun provideBaseUrl() = Constans.BASE_URL

    fun provideRetrofitInstantce(BASE_URL: String): ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)

}