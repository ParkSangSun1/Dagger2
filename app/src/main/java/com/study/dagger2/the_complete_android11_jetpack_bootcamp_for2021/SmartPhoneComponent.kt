package com.study.dagger2.the_complete_android11_jetpack_bootcamp_for2021

import dagger.Component

@Component
//(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}