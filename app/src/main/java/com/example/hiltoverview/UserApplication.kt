package com.example.hiltoverview

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//@HiltAndroidApp -- Annotation for Hilt Android Application

@HiltAndroidApp
class UserApplication :Application() {

      @Inject
      lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

        userRepository.saveUser("prerna@gmail.com","1111")
    }
}