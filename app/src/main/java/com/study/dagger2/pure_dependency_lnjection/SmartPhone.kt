package com.study.dagger2.pure_dependency_lnjection

import android.util.Log

class SmartPhone(val battery : Battery, val simCard:SIMCard, val memoryCard: MemoryCard) {
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