package com.example.myhilt

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

class MainFragmentFactory @Inject constructor(
    private val test: String
): FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            TestFragment::class.java.name -> {
                TestFragment(test)
            }
            else -> super.instantiate(classLoader, className)
        }
    }

}