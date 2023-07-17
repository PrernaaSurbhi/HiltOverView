package com.example.hiltoverview

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun logMessage(msg:String){
        Log.d("LoggerService",msg)
    }
}