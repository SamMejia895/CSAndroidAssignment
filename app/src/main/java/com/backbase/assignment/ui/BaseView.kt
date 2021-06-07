package com.backbase.assignment.ui

interface BaseView<T> {
    fun setPresenter(presenter: T)
}