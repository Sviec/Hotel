package com.example.hotel.data.entity

import com.example.hotel.entity.RoomEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

data class RoomDao(
    @Json(name = "id") override val id: Int,
    @Json(name = "name") override val name: String,
    @Json(name = "price") override val price: Double,
    @Json(name = "price_per") override val pricePer: String,
    @Json(name = "peculiarities") override val peculiarities: List<String>,
    @Json(name = "image_urls") override val imageUrls: List<String>,
): RoomEntity
