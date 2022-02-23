package com.example.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MovieResponse(
    @SerializedName("boxOfficeResult")
    var boxofficeResult: BoxOfficeList?
)

data class BoxOfficeList(
    @SerializedName("dailyBoxOfficeList")
    var dailyBoxOfficeList: List<Dto> = arrayListOf()
)

data class Dto(
    @SerializedName("rank")
    var rank : String?,
    @SerializedName("openDt")
    var openDt : String?,
    @SerializedName("movieNm")
    var movieNm : String?,
) : Serializable