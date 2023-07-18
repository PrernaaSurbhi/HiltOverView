package com.example.hiltoverview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

//for feild injection in fragment - we have to use the same step as Activity feild injection.
//But we have to always add @AndroidEntryPoint on respective activity.

@AndroidEntryPoint
class MainFragment: Fragment() {

    @Inject
    @FireBaseQualifier
    lateinit var userRepository: UserRepository

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userRepository.saveUser("MainFragment","MainFragment_feildInjection")
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}