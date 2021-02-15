package com.example.myhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    @String1
    lateinit var string1: String

    @Inject
    @String2
    lateinit var string2: String

    // There is a easiest way called @Name same as Dagger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "String 1 -> $string1 ")
        Log.e(TAG, "String 2 -> $string2 ")

    }

}