package com.example.data.datasource


import com.example.data.model.api.RetrofitInterface
import com.example.data.model.response.Dto
import javax.inject.Inject

class DataSourceImpl @Inject constructor(
    private val retrofitInterface: RetrofitInterface
) : DataSource {
    override suspend fun getDataSource(
        key: String,
        targetDt: String
    ): List<Dto> {
        val result= retrofitInterface.getBoxOffice(key,targetDt)

        if(result.isSuccessful){
            val response = result.body()
            val list : List<Dto> = response!!.boxofficeResult!!.dailyBoxOfficeList
            return list
        }else{
            return emptyList()
        }
    }
}