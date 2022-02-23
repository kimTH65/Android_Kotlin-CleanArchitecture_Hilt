package com.example.data.datasource

import com.example.data.model.response.Dto

interface DataSource {
    suspend fun getDataSource(
        key: String,
        targetDt: String
    ): List<Dto>?
}