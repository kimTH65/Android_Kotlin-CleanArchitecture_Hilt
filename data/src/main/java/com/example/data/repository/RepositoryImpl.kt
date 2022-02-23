package com.example.data.repository

import com.example.data.datasource.DataSource
import com.example.data.mapper.Mapper
import com.example.domain.model.Dto
import com.example.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dataSource: DataSource
) : Repository {
    override suspend fun provideRepository(key: String, targetDt: String): List<Dto> {
        return Mapper.mapperData(dataSource.getDataSource(key,targetDt))!!
    }
}
