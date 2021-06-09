package com.backbase.assignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.backbase.assignment.R
import com.backbase.assignment.ui.di.DependencyInjectorImpl


class MainActivity : AppCompatActivity() , MainContract.View {
//    internal lateinit var imageView: ImageView
  //  internal lateinit var button: Button

    // 2
    internal lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // imageView = findViewById(R.id.imageView)
        //button = findViewById(R.id.button)

        // 3
        setPresenter(MainPresenter(this, DependencyInjectorImpl()))
        presenter.onViewCreated()

        // 4
        //button.setOnClickListener { presenter.onLoadWeatherTapped() }
    }

    // 5
    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }




    override fun displayWeatherState(s:String) {
        this.presenter = presenter
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        this.presenter = presenter
    }


}