package com.example.myhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
object MyModule {

    @String1
    @ActivityScoped
    @Provides
    fun provideString1() = " This is String 1 "

    @String2
    @ActivityScoped
    @Provides
    fun provideString2() = " This is String 2 "


}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class String1

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class String2