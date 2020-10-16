package com.example.rc_sampleapp.presenter

import com.example.rc_sampleapp.MainContract
import com.example.rc_sampleapp.model.PlanetWrapper
import com.example.rc_sampleapp.model.Planets
import com.example.rc_sampleapp.network.PlanetApi
import com.example.rc_sampleapp.network.PlanetRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlanetPresenter(private var planetView: MainContract.View?, private var api: PlanetApi?) :
    MainContract.Presenter {

    override fun getCall() {
        PlanetRetrofit.run {
            getRetrofitInstance()
                .create(PlanetApi::class.java)
                .getPlanetData()
                .enqueue(object : Callback<PlanetWrapper> {
                    override fun onResponse(
                        call: Call<PlanetWrapper>?,
                        response: Response<PlanetWrapper>?
                    ) {
                        val res = ArrayList<Planets>()
                        val result = response?.body()?.solarSystem
                        for (i in 0 until result?.size!!) {
                            val list = result[0]
                            res.add(list)
                        }
                        planetView?.showPlanetInfo(res)
                    }

                    override fun onFailure(call: Call<PlanetWrapper>?, t: Throwable?) {

                    }

                })
        }
    }
}


