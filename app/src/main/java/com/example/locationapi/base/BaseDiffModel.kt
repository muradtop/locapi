package com.example.locationapi.base

interface BaseDiffModel {
    val id: String
    override fun equals(other: Any?): Boolean
}