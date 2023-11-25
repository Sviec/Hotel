package com.example.hotel.data.entity

import com.example.hotel.entity.HotelEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HotelDao(
    @Json(name = "id") override val id: Int,
    @Json(name = "name") override val name: String,
    @Json(name = "adress") override val adress: String,
    @Json(name = "minimal_price") override val minimalPrice: Double,
    @Json(name = "price_for_it") override val priceForIt: String,
    @Json(name = "rating") override val rating: Int,
    @Json(name = "rating_name") override val ratingName: String,
    @Json(name = "image_urls") override val imageUrls: List<String>,
    @Json(name = "about_the_hotel") override val aboutTheHotel: HotelDescriptionDao,
) : HotelEntity