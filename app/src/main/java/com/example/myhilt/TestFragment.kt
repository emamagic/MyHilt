package com.example.myhilt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

@FragmentScoped
class TestFragment @Inject constructor(): Fragment(R.layout.fragment_test) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}