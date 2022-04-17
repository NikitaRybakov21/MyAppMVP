package com.example.myappmvp.presenter

import com.example.myappmvp.model.Model
import com.example.myappmvp.retrofit.ResponseDateOneCall
import com.example.myappmvp.retrofit.RetrofitImpl
import com.example.myappmvp.ui.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(private val model : Model, private val retrofitImpl: RetrofitImpl) :
    InterfacePresenter {
    private var activity : MainActivity? = null

    override fun sendServer() {
        val data = model.calc()

        retrofitImpl.getRetrofit().getOneCallAPI("0000","dsffdsafc","dascsfd").enqueue(callback)
        activity?.setText(data.toString())
    }

    private val callback = object : Callback<ResponseDateOneCall> {
        override fun onResponse(call: Call<ResponseDateOneCall>, response: Response<ResponseDateOneCall>) {
            activity?.setText2("babygan")
        }

        override fun onFailure(call: Call<ResponseDateOneCall>, t: Throwable) {
            activity?.setText2("not babygan")
        }
    }

    override fun attach(activity: MainActivity) {
        this.activity = activity
    }

    override fun detach() {
        this.activity = null
    }
}