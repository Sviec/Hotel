package com.example.hotel.entity

import com.squareup.moshi.Json

interface HotelDescriptionEntity {
    val description: String
    val peculiarities: List<String>
}