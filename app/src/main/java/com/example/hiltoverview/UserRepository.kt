package com.example.hiltoverview

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(val loggerService: LoggerService){

    fun saveUser(email:String,password:String){
        loggerService.logMessage("user saved in DB")
    }

    companion object{
        val Tagg = "UserRepository"
    }
}