package com.example.hotel.entity

import com.example.hotel.data.entity.HotelDescriptionDao
import com.squareup.moshi.Json

interface HotelEntity {
    val id: Int
    val name: String
    val adress: String
    val minimalPrice: Double
    val priceForIt: String
    val rating: Int
    val ratingName: String
    val imageUrls: List<String>
    val aboutTheHotel: HotelDescriptionEntity
}