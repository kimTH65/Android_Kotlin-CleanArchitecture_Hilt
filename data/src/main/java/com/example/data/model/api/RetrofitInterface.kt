package com.example.data.model.api

import com.example.data.model.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {
    @GET("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json")
    suspend fun getBoxOffice( // suspend = Coroutine사용
        @Query("key") key: String?,
        @Query("targetDt") targetDt: String?
    ): Response<MovieResponse>
}