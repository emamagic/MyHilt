package com.example.myhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
object MyModule {

    @Provides
    @IntoSet
    fun provideInterceptor() = HttpLoggingInterceptor()

    @String1
    @ActivityScoped
    @Provides
    fun provideString1() = " This is String 1 "

    @String2
    @ActivityScoped
    @Provides
    fun provideString2(@ApplicationContext context: Context) = "${context.getString(R.string.app_name)}"


}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class String1

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class String2