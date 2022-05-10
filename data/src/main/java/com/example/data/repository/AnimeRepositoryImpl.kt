package com.example.data.repository

import com.example.data.dtos.toDomain
import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.repository.base.BaseRepository
import com.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    override fun fetchAnime() = sendRequest {
        animeApiService.getAnimeLocations().map { it.toDomain() }


    }
}