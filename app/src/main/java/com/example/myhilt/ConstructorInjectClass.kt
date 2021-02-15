package com.example.myhilt

import com.google.gson.Gson
import javax.inject.Inject

class ConstructorInjectClass @Inject constructor(
    private val myInterface: TestInterface,
    private val gson: Gson
) {

    fun doInterface(){
        myInterface.doTask()
    }

    fun doGson(){
        gson.excluder()
    }

}