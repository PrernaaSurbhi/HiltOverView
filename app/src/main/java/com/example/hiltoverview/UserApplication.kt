package com.example.hiltoverview

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

//@HiltAndroidApp -- Annotation for Hilt Android Application class

@HiltAndroidApp
class UserApplication :Application() {

    override fun onCreate() {
        super.onCreate()

    }
}