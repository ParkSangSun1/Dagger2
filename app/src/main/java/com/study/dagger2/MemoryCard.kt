package com.study.dagger2

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor(){
    init {
        Log.i("TAG","Memort Card")
    }

    fun getSpaceAvailablity(){
        Log.i("TAG","Memory space available")
    }
}