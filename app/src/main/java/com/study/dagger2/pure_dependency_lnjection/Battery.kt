package com.study.dagger2.pure_dependency_lnjection

import android.util.Log

class Battery {
    init {
        Log.i("TAG","베터리")
    }
    fun getPower(){
        Log.i("TAG","베터리 Power")
    }
}