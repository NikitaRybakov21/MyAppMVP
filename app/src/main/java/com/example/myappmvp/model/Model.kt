package com.example.myappmvp.model

import com.example.myappmvp.model.InterfaceModel

class Model : InterfaceModel {

    override fun calc(): Int {
        return 5 * 5
    }
}