package com.study.dagger2

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone() : SmartPhone
}