package com.example.data.dtos

import com.domain.models.AnimeModel
import com.google.gson.annotations.SerializedName


data class AnimeDto(
    @SerializedName("id")
     val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

fun AnimeDto.toDomain() = AnimeModel(id, name, url)