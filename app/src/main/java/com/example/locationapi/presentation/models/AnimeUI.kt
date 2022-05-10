package com.example.locationapi.presentation.models

import com.domain.models.AnimeModel
import com.example.locationapi.base.BaseDiffModel


data class AnimeUI(
    override val id: String,
    val name: String,
    val url: String
) : BaseDiffModel

fun AnimeModel.toUI() = AnimeUI(id, name, url)