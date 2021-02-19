package com.example.myhilt

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@AndroidEntryPoint
class TestFragment @Inject constructor(
    private val test: String
) : Fragment(R.layout.fragment_test) {

    private val TAG = "TestFragment"
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG, "onViewCreated: ${test}", )
    }
}