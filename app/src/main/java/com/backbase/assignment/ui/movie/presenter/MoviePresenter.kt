package com.backbase.assignment.ui.movie.presenter

import com.backbase.assignment.ui.movie.model.CallResult
import com.backbase.assignment.ui.movie.model.MovieVO

interface MoviePresenter{
    fun showAllSearch(): CallResult
    fun createRecycler(data: List<MovieVO>)

}