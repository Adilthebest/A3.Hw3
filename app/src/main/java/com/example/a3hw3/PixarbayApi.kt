package com.example.a3hw3

import android.telecom.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Query

interface PixarbayApi {
    @GET("/api/")
    fun getImageByWorld
                (@Query("key") key:String="28273167-f1d30e392dc0e1c7eb28811fd",
                 @Query("q") keyWorld :String
    ):retrofit2.Call<PixarModel>

    }
