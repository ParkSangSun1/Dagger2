package com.study.dagger2.pure_dependency_lnjection

import android.util.Log

class MemoryCard {
    init {
        Log.i("TAG","Memort Card")
    }

    fun getSpaceAvailablity(){
        Log.i("TAG","Memory space available")
    }
}