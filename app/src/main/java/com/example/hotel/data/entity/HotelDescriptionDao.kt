package com.example.hotel.data.entity

import com.example.hotel.entity.HotelDescriptionEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

data class HotelDescriptionDao (
    @Json(name = "description") override val description: String,
    @Json(name = "peculiarities") override val peculiarities: List<String>
) : HotelDescriptionEntity