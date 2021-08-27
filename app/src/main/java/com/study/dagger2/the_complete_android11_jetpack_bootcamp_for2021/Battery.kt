package com.study.dagger2.the_complete_android11_jetpack_bootcamp_for2021

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.i("TAG","베터리")
    }
    fun getPower(){
        Log.i("TAG","베터리 Power")
    }
}