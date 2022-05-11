package com.example.locationapi.presentation.ui.fragments

 import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.locationapi.R
import com.example.locationapi.presentation.ui.adapters.AnimeAdapter
import com.example.locationapi.presentation.base.BaseFragment
import com.example.locationapi.databinding.FragmentAnimeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter()


    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.apply {
            adapter = animeAdapter
        }

    }

    override fun launchObservers() {
        viewModel.animeState.spectateUiState(error = { print("Блин баллов мало") },
            success = {
                animeAdapter.submitList(it)
            })
    }

}

