package com.backbase.assignment.ui.movie.presenter

import com.backbase.assignment.ui.movie.model.CallResult
import com.backbase.assignment.ui.movie.model.MovieVO
import com.backbase.assignment.ui.movie.view.MovieView
import com.backbase.assignment.ui.rest.MovieService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MoviePresenterImpl : MoviePresenter {
    private val BASE_URL = "https://api.themoviedb.org/3"
    private val yourKey = "527192de06e6ccabd93e543b0efbda82"
/*

    var searchVo: CallResult? = null
    var view: MovieView? = null

    @Inject
    fun MoviePresenterImpl() {
    }

    fun attachView(view: MovieView?) {
        this.view = view
    }

    fun detachView() {
        view = null
    }

    fun getAllSearch(): CallResult? {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        val movieService: MovieService = retrofit.create(MovieService::class.java)
        val callPersons: Call<CallResult> = movieService.nowplaying()
        callPersons.enqueue(object : Callback<CallResult?> {
            override fun onResponse(call: Call<CallResult?>, response: Response<CallResult?>) {
                searchVo = response.body()
                view.createRecycler(searchVo.getData())
            }

            override fun onFailure(call: Call<SearchVO?>, t: Throwable) {
                t.printStackTrace()
            }
        })
        return searchVo
    }*/

    override fun showAllSearch(): CallResult {
        TODO("Not yet implemented")
    }

    override fun createRecycler(data: List<MovieVO>) {
        TODO("Not yet implemented")
    }
}
