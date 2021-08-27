package com.study.dagger2.the_complete_android11_jetpack_bootcamp_for2021

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard(): MemoryCard {
        return MemoryCard()
    }
}