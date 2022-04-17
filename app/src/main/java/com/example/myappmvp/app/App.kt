package com.example.myappmvp.app

import android.app.Application
import com.example.myappmvp.model.Model
import com.example.myappmvp.presenter.Presenter
import com.example.myappmvp.retrofit.RetrofitImpl

class App : Application() {

    lateinit var presenter : Presenter

    override fun onCreate() {
        super.onCreate()

        instance = this
        presenter = Presenter(Model(), RetrofitImpl())
    }

    companion object {
        lateinit var instance: App private set
    }
}