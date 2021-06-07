package com.backbase.assignment.ui.di

import com.backbase.assignment.ui.movie.presenter.MoviePresenter

interface DependencyInjector {
    fun moviePresenter() : MoviePresenter
}