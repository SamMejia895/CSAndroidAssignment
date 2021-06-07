package com.backbase.assignment.ui.movie.view

import com.backbase.assignment.ui.movie.model.CallResult
import com.backbase.assignment.ui.movie.model.MovieVO

interface MovieView {
    fun showAllSearch(): CallResult
    fun createRecycler(data: List<MovieVO>)
}