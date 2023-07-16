package com.example.hiltoverview

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(email:String,password:String){
        Log.d(Tag,"User created in DB")
    }

    companion object{
        val Tag = "UserRepository"
    }
}