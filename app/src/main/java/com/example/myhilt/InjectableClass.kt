package com.example.myhilt

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class InjectableClass @Inject constructor(){

    fun doTask() = " Task Done ... "
}