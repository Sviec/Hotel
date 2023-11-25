package com.example.hotel.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)

data class RoomsDao (
    @Json(name = "rooms") val rooms: List<RoomDao>
)