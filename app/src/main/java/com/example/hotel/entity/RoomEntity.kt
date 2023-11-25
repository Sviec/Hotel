package com.example.hotel.entity

import com.squareup.moshi.Json

interface RoomEntity {
    val id: Int
    val name: String
    val price: Double
    val pricePer: String
    val peculiarities: List<String>
    val imageUrls: List<String>
}