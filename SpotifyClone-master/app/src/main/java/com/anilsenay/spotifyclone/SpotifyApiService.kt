package com.anilsenay.spotifyclone

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface SpotifyApiService {
    @GET("popularRadios.json")
    //fun getPopularRadios(): Call<List<Radio>>
    fun getPopularRadios(): Single<List<Radio>> //Rxjava

    @GET("locationRadios.json")
    fun getLocationRadios(): Single<List<Radio>>
}