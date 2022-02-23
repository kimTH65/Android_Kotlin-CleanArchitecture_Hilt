package com.example.memo.di

import com.example.data.datasource.DataSource
import com.example.data.datasource.DataSourceImpl
import com.example.data.model.api.RetrofitInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun provideDataSource(retrofitInterface: RetrofitInterface): DataSource = DataSourceImpl(retrofitInterface)
}