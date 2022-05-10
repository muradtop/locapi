package com.domain.repositories

import com.domain.either.Either
import com.domain.models.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime(): Flow<Either<String, List<AnimeModel>>>
}