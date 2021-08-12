package com.study.dagger2

import android.util.Log
import javax.inject.Inject

//생성자를 보이게 해야 의존성 주입이 가능하다(constructor)
class SmartPhone @Inject constructor(val battery : Battery, val simCard: SIMCard, val memoryCard: MemoryCard) {
    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailablity()
        Log.i("TAG","SmartPhone constructed")
    }

    fun makeACallWithRecording(){
        Log.i("TAG","Calling")
    }
}