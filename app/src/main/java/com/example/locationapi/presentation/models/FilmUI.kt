package com.example.locationapi.presentation.models

import com.domain.models.FilmModel
import com.example.locationapi.base.BaseDiffModel


data class FilmUI(
    override val id: String,
    val name: String,
    val url: String
) : BaseDiffModel

fun FilmModel.toUI() = FilmUI(id, name, url)