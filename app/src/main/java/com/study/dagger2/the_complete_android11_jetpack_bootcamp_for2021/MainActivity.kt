package com.study.dagger2.the_complete_android11_jetpack_bootcamp_for2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.dagger2.R

class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()*/

        //생성자 주입 방법, 함수를 사용하여 종속성 전달
//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ServiceProvider()),
//            MemoryCard()
//        )
//            .makeACallWithRecording()

    }
}