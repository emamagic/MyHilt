package com.example.myhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object MyModule {

    @ActivityScoped
    @Provides
    fun provideString1() = " This is String 1"

    @ActivityScoped
    @Provides
    fun provideString2() = " This is String 2"
}