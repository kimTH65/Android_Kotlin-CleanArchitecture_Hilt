package com.example.memo.di

import com.example.data.repository.RepositoryImpl
import com.example.domain.usecase.UseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideUseCase(repositoryImpl: RepositoryImpl) : UseCase = UseCase(repositoryImpl)
}