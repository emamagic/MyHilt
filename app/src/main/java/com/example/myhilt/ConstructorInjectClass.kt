package com.example.myhilt

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConstructorInjectClass @Inject constructor(
    private val task: InjectableClass
) {
    init {
        Log.e("onCreate", "Object Created")
    }
    fun doTask() = task.doTask()
}