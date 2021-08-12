package com.study.dagger2

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {


    init {
        Log.i("TAG","SIM Card")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}