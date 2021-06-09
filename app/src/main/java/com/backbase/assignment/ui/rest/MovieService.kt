package com.backbase.assignment.ui.rest

import com.backbase.assignment.ui.movie.model.CallResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieService {
/*
    @GET("3/movie/now_playing?language=en-US&page=undefined&?")
    fun getInformation(): Call<CallResult>
*/

    @GET("movie/now_playing?language=en-US&page=undefined&?")
    fun getInformation(
        @Query("api_key") apiKey: String = "527192de06e6ccabd93e543b0efbda82"
    ): Call<CallResult>

}