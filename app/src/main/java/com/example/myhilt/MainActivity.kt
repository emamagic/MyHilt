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
    lateinit var constructorInjectClass: ConstructorInjectClass

    // This is wrong and cause crash
//    @Inject
//    lateinit var testFragment: TestFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "onCreate: ${constructorInjectClass.doTask()}")


        btn_go.setOnClickListener { recreate() }


    }



}