package com.backbase.assignment.ui.di

import com.backbase.assignment.ui.movie.presenter.MoviePresenter
import com.backbase.assignment.ui.movie.presenter.MoviePresenterImpl


class DependencyInjectorImpl: DependencyInjector {
    override fun moviePresenter(): MoviePresenter {
        return MoviePresenterImpl()
    }
}
