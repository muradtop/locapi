package com.example.locationapi.di

import com.domain.repositories.AnimeRepository
import com.example.data.repository.AnimeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module()
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun provideAnimeRepository(animeRepositoryImpl: AnimeRepositoryImpl): AnimeRepository

}