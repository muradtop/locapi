package com.example.data.dtos

import com.domain.models.FilmModel
import com.google.gson.annotations.SerializedName


data class FilmDto(
    @SerializedName("id")
     val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)

fun FilmDto.toDomain() = FilmModel(id, name, url)