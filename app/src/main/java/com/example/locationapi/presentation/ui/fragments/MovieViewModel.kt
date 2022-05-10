package com.example.locationapi.presentation.ui.fragments

import com.domain.usecases.FetchMoviesUseCase
import com.example.locationapi.base.BaseViewModel
import com.example.locationapi.presentation.models.FilmUI
import com.example.locationapi.presentation.models.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val fetchMoviesUseCase: FetchMoviesUseCase
) :
    BaseViewModel() {

    private val _movieState = mutableUiStateFlow<List<FilmUI>>()
    var movieState = _movieState.asStateFlow()


    init {
        fetchMovies()
    }

    fun fetchMovies() =
        fetchMoviesUseCase().gatherRequest(_movieState) { it -> it.map { it.toUI() } }


}