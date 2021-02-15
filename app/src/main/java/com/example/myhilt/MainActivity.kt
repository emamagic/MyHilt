package com.example.myhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var injectableClass: InjectableClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val task = injectableClass.doTask()

        Log.e(TAG, "onCreate: $task")

    }

}