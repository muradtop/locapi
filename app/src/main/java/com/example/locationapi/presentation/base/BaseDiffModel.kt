package com.example.locationapi.presentation.base

interface BaseDiffModel {
    val id: String
    override fun equals(other: Any?): Boolean
}