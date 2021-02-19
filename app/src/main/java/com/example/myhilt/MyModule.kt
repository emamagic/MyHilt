package com.example.myhilt

import android.content.Context
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object MyModule {


    @ActivityScoped
    @Provides
    fun provideString() = " Provide String "

    @ActivityScoped
    @Provides
    fun provideTestInterface(gson: Gson ,@ApplicationContext context: Context): TestInterface {
        return ConstructorInjectClass(gson)
    }

    @ActivityScoped
    @Provides
    fun provideGson(): Gson = Gson()
}