package com.study.dagger2.the_complete_android11_jetpack_bootcamp_for2021

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){
    init {
        Log.i("TAG","Service Provider")
    }

    fun getServiceProvider(){
        Log.i("TAG","Service provider connected")
    }
}