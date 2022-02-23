package com.example.domain.repository

import com.example.domain.model.Dto


interface Repository {

    suspend fun provideRepository(key: String,targetDt: String) : List<Dto>

}
