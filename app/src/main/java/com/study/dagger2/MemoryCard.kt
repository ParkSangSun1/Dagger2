package com.study.dagger2

import android.util.Log
import javax.inject.Inject

//타사(retrofit2 등) 라이브러리에서 가져온 클래스라고 가정한다
class MemoryCard {
    init {
        Log.i("TAG","Memort Card")
    }

    fun getSpaceAvailablity(){
        Log.i("TAG","Memory space available")
    }
}