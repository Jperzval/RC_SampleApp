package com.example.rc_sampleapp.network

import retrofit2.Call
import retrofit2.http.GET

interface PlanetApi {

    @GET(ENDPOINT)
    fun getPlanetData(): Call<List<PlanetApi>>

    companion object {
        const val ENDPOINT = "/Jperzval/RC_SampleApp/master/JSON?token=AKN5FF6Z5LYJK54MWBC75NC7QDNL2"
    }
}