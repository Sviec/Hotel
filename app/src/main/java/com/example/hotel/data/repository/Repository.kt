package com.example.hotel.data.repository

import com.example.hotel.data.api.RetrofitInstance
import com.example.hotel.entity.HotelEntity
import com.example.hotel.entity.RoomEntity

class Repository {
    suspend fun getHotelInfo() : HotelEntity {
        return RetrofitInstance.hotelApi.hotelInfo()
    }

    suspend fun getRoomsInfo() : List<RoomEntity> {
        return RetrofitInstance.hotelApi.roomsInfo().rooms
    }
}