package com.example.a3hw3

import android.app.Application

class App:Application() {

    companion object{
lateinit var api: PixarbayApi
    }
    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.api
    }
}