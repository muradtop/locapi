package com.domain.usecases

import com.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase @Inject constructor(private val repository: AnimeRepository) {
    operator fun invoke() = repository.fetchAnime()
}