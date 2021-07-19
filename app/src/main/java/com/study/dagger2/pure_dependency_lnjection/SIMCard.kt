package com.study.dagger2.pure_dependency_lnjection

import android.util.Log

class SIMCard(private val serviceProvider: ServiceProvider) {


    init {
        Log.i("TAG","SIM Card")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}