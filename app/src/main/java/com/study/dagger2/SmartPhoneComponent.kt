package com.study.dagger2

import dagger.Component

@Component
//(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}