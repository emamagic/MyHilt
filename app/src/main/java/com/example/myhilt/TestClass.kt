package com.example.myhilt

import javax.inject.Inject

class TestClass @Inject constructor() {

    fun doTask() = "Test Completed"
}