package com.example.myappmvp.presenter

import com.example.myappmvp.ui.MainActivity

interface InterfacePresenter {

    fun sendServer()
    fun attach(activity: MainActivity)
    fun detach()
}