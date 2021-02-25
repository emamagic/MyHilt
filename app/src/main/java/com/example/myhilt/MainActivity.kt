package com.example.myhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var fragmentFactory: MainFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("TAG", "onCreate: Activity $savedInstanceState")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.fragmentFactory = fragmentFactory
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container ,TestFragment::class.java ,null)
            .commit()

    }


//        val entryPoint = EntryPointAccessors.fromActivity(this ,MyFragmentFactoryEntryPoint::class.java)
//        supportFragmentManager.fragmentFactory = entryPoint.getFragmentFactory()

}