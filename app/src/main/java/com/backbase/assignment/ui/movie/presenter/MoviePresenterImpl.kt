package com.backbase.assignment.ui.movie.presenter

import android.util.Log
import com.backbase.assignment.ui.movie.model.CallResult
import com.backbase.assignment.ui.movie.model.MovieVO
import com.backbase.assignment.ui.rest.MovieService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
val TAG ="MoviePresenterImpl"
val BASE_URL = "https://api.themoviedb.org/3/"
class MoviePresenterImpl : MoviePresenter {


    private val yourKey = "527192de06e6ccabd93e543b0efbda82"

    var movieVo: MovieVO? = null

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

    override fun showAllSearch(): CallResult? {
        Log.d(TAG,"llego")
      return  MoviesRepository.getPopularMovies()
    }

    override fun createRecycler(data: List<MovieVO>) {
        TODO("Not yet implemented")
    }

    object MoviesRepository {
        private val api: MovieService
        var callResult: CallResult? = null

        init {
            val interceptor = HttpLoggingInterceptor()
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
            api = retrofit.create(MovieService::class.java)
        }


        fun getPopularMovies(): CallResult? {
            api.getInformation()
                .enqueue(object : Callback<CallResult> {
                    override fun onResponse(
                        call: Call<CallResult>,
                        response: Response<CallResult>
                    ) {
                        if (response.isSuccessful) {
                            callResult=response.body()
                            val responseBody = response.body()

                            if (responseBody != null) {
                                Log.d(TAG, "Movies: ${responseBody.page}")

                            } else {
                                Log.d(TAG, "Failed to get response")
                            }
                        }
                    }

                    override fun onFailure(call: Call<CallResult>, t: Throwable) {
                        Log.e(TAG, "onFailure", t)
                    }
                })
            return callResult
        }
    }
}
