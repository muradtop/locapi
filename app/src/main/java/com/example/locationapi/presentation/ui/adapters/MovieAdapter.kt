package com.example.locationapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.locationapi.base.BaseDiffUtil
import com.example.locationapi.databinding.ItemMovieBinding
import com.example.locationapi.presentation.models.FilmUI

class MovieAdapter :
    ListAdapter<FilmUI, MovieAdapter.MovieViewHolder>(BaseDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            ItemMovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MovieViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: FilmUI) {
            binding.apply {
                tvTitle.text = data.name
            }


        }
    }
}