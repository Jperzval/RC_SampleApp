package com.example.rc_sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rc_sampleapp.model.Planets
import com.example.rc_sampleapp.network.PlanetApi
import com.example.rc_sampleapp.network.PlanetRetrofit
import com.example.rc_sampleapp.presenter.PlanetPresenter
import com.example.rc_sampleapp.view.PlanetAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private var presenter: PlanetPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val api: PlanetApi = PlanetRetrofit.getRetrofitInstance().create(PlanetApi::class.java)
        presenter = PlanetPresenter(this, api)
        presenter!!.getCall()
    }

    override fun showPlanetInfo(list: List<Planets>) {
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PlanetAdapter(list)
        }
    }

    override fun showError() {
        TODO("Not yet implemented")
    }
}