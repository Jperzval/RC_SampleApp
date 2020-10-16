package com.example.rc_sampleapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PlanetRetrofit {

    private const val BASE_URL = "https://raw.githubusercontent.com"

    fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }
}