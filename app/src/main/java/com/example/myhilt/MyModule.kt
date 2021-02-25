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

    @ActivityScoped
    @Provides
    fun provideString1() = " constructor inject fragment "


}
