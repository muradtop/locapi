package com.example.locationapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.locationapi.presentation.base.BaseDiffUtil
import com.example.locationapi.databinding.ItemAnimeBinding
import com.example.locationapi.presentation.models.AnimeUI

class AnimeAdapter :
    ListAdapter<AnimeUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: AnimeUI) {
            binding.apply {
                tvLocations.text = data.name
                tvLocationsOne.text = data.climate
                tvLocationsTwo.text = data.terrain
                tvLocationsThree.text = data.surface_water
            }


        }
    }
}