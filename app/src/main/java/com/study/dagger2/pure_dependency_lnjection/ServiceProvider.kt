package com.study.dagger2.pure_dependency_lnjection

import android.util.Log

class ServiceProvider {
    init {
        Log.i("TAG","Service Provider")
    }

    fun getServiceProvider(){
        Log.i("TAG","Service provider connected")
    }
}