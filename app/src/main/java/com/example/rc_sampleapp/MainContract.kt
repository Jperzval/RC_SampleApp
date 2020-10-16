package com.example.rc_sampleapp

import com.example.rc_sampleapp.model.Planets

interface MainContract {

    interface View {
        fun showPlanetInfo(list: List<Planets>)
        fun showError()
    }

    interface Presenter{
        fun getCall()
    }
}