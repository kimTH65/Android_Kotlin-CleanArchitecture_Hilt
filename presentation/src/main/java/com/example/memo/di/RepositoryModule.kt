package com.example.memo.di

import com.example.data.datasource.DataSourceImpl
import com.example.data.repository.RepositoryImpl
import com.example.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(dataSourceImpl: DataSourceImpl): Repository = RepositoryImpl(dataSourceImpl)
}