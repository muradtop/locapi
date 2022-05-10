package com.example.data.remote.apiservice

import com.example.data.dtos.AnimeDto
import retrofit2.http.GET

interface AnimeApiService {

    @GET("locations")
    suspend fun getAnimeLocations(): List<AnimeDto>
}