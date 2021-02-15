package com.example.myhilt

import javax.inject.Inject

class ConstructorInjectClass @Inject constructor(
    private val task: InjectableClass
) {

    fun doTask() = task.doTask()
}