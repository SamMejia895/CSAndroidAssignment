package com.backbase.assignment.ui



interface MainContract {
    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onLoadWeatherTapped()
    }

    interface View : BaseView<Presenter> {
        fun displayWeatherState(page:String)
    }
}