package com.example.locationapi.presentation.ui.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.locationapi.R
import com.example.locationapi.presentation.ui.adapters.MovieAdapter
import com.example.locationapi.base.BaseFragment
import com.example.locationapi.databinding.FragmentMovieBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : BaseFragment<FragmentMovieBinding, MovieViewModel>(R.layout.fragment_movie) {
    override val binding by viewBinding(FragmentMovieBinding::bind)
    override val viewModel: MovieViewModel by viewModels()
    private val movieAdapter = MovieAdapter()


    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.apply {
            adapter = movieAdapter
        }

    }

    override fun launchObservers() {
        viewModel.movieState.spectateUiState(error = { print(" ты меня не достойна , fuck you") },
            success = {
                movieAdapter.submitList(it)
            })
    }

}

