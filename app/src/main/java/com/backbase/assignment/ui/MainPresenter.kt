package com.backbase.assignment.ui

import com.backbase.assignment.ui.di.DependencyInjectorImpl
import com.backbase.assignment.ui.movie.presenter.MoviePresenter

class MainPresenter(
    view: MainContract.View,
    dependencyInjector: DependencyInjectorImpl
) : MainContract.Presenter {

    // 2
    private val moviePresenter: MoviePresenter = dependencyInjector.moviePresenter()

    // 3
    private var view: MainContract.View? = view


    override fun onViewCreated() {

        view?.displayWeatherState(moviePresenter.showAllSearch()?.page.toString())

    }

    override fun onLoadWeatherTapped() {
        loadWeather()
    }

    override fun onDestroy() {
        this.view = null
    }

    private fun loadWeather() {


        // Make sure to call the displayWeatherState on the view
        view?.displayWeatherState("S")
    }

}