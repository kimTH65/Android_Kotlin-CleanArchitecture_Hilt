package com.example.data.mapper

import com.example.data.model.response.Dto


object Mapper {
    fun mapperData(response: List<Dto>?) : List<com.example.domain.model.Dto>?{
        return if (response !=null){
            response.toDomain()
        }else null
    }

    fun List<Dto>.toDomain() : List<com.example.domain.model.Dto>{
        return this.map {
            com.example.domain.model.Dto(it.rank,it.openDt,it.movieNm)
        }
    }
}