package com.example.domain.usecase

import com.example.domain.model.Dto
import com.example.domain.repository.Repository
import javax.inject.Inject

class UseCase @Inject constructor(private val repository: Repository) {

    suspend fun getMovie(key: String,targetDt:String): List<Dto> {
        val list = repository.provideRepository(key,targetDt)
        return list
    }
}
