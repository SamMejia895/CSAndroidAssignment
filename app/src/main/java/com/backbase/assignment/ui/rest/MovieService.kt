package com.backbase.assignment.ui.rest

import com.backbase.assignment.ui.movie.model.CallResult
import retrofit2.Call
import retrofit2.http.GET


interface MovieService {

    @GET("3/movie/now_playing?language=en-US&page=undefined&?")
    fun getInformation(): Call<CallResult>

}