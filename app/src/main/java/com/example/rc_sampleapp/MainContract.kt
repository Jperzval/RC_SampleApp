package com.example.rc_sampleapp

interface MainContract {

    interface View {
        fun showItems()
        fun showError()
    }

    interface Presenter{
        fun getCall()
    }
}