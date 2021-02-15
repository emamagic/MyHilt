package com.example.myhilt

import javax.inject.Inject

class InjectableClass @Inject constructor(){

    fun doTask() = " Task Done ... "
}