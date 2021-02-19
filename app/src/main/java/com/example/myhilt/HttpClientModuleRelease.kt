package com.example.myhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.DefineComponent
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.Multibinds
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class HttpClientModuleRelease {

    @Multibinds
    abstract fun interceptorSet(): Set<Interceptor>

    companion object {
        @Provides
        @Singleton
        fun provideClient(interceptor: Set<Interceptor>) =
            OkHttpClient.Builder().apply {
                interceptor.forEach { addInterceptor(it) }
            }.build()
    }

}