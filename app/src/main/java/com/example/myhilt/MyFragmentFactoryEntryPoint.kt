package com.example.myhilt

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@EntryPoint
@InstallIn(ActivityComponent::class)
interface MyFragmentFactoryEntryPoint {
    fun getFragmentFactory(): MainFragmentFactory
}
