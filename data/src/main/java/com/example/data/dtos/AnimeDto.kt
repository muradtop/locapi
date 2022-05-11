package com.example.data.dtos

import com.domain.models.AnimeModel
import com.google.gson.annotations.SerializedName


data class AnimeDto(
    @SerializedName("id")
     val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("climate")
    val climate: String,
    @SerializedName("terrain")
    val terrain: String,
    @SerializedName("surface_water")
    val surfaceWater: String,
    @SerializedName("url")
    val url: String
)

fun AnimeDto.toDomain() = AnimeModel(id, name,climate, terrain, surfaceWater, url)
