package com.study.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.dagger2.pure_dependency_lnjection.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //생성자 주입 방법, 함수를 사용하여 종속성 전달
        val smartPhone = SmartPhone(
            Battery(),
            SIMCard(ServiceProvider()),
            MemoryCard()
        )
            .makeACallWithRecording()

    }
}