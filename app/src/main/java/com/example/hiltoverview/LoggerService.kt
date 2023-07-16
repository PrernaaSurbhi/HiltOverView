package com.example.hiltoverview

import android.util.Log
import com.example.hiltoverview.UserRepository.Companion.Tagg
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun logMessage(msg:String){
        Log.d(Tagg,msg)
    }
}