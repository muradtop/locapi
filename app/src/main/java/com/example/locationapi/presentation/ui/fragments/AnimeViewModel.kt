package com.example.locationapi.presentation.ui.fragments

import com.domain.usecases.FetchAnimeUseCase
import com.example.locationapi.base.BaseViewModel
import com.example.locationapi.presentation.models.AnimeUI
import com.example.locationapi.presentation.models.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) :
    BaseViewModel() {

    private val _animeState = mutableUiStateFlow<List<AnimeUI>>()
    var animeState = _animeState.asStateFlow()


    init {
        fetchAnime()
    }

    fun fetchAnime() =
        fetchAnimeUseCase().gatherRequest(_animeState) { it -> it.map { it.toUI() } }


}