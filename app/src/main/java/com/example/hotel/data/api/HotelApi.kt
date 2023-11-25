package com.example.hotel.data.api

import com.example.hotel.data.entity.HotelDao
import com.example.hotel.data.entity.RoomsDao
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
    val hotelApi: HotelApi = retrofit.create(HotelApi::class.java)
}

interface HotelApi {
    @GET("/d144777c-a67f-4e35-867a-cacc3b827473")
    suspend fun hotelInfo(): HotelDao

    @GET("/8b532701-709e-4194-a41c-1a903af00195")
    suspend fun roomsInfo(): RoomsDao
}