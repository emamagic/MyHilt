package com.example.myhilt

import com.google.gson.Gson
import javax.inject.Inject

class ConstructorInjectClass @Inject constructor(
    private val gson: Gson
): TestInterface {

    override fun doTask() {

    }


}