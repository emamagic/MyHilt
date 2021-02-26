package com.example.myhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
object LoggingInterceptorModule{

    @Provides
    @IntoSet
    fun provideInterceptor() = LoggingInterceptor()
    54321728d
}
