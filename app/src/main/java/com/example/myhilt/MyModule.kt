package com.example.myhilt

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MyModule {


    @ActivityScoped
    @Provides
    fun provideString() = " Provide String "

    @ActivityScoped
    @Provides
    fun provideTestInterface(gson: Gson): TestInterface {
        return ConstructorInjectClass(gson)
    }

    @ActivityScoped
    @Provides
    fun provideGson(): Gson = Gson()
}