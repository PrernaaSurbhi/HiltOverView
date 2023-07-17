package com.example.hiltoverview

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SqlRepository @Inject constructor():UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d("SqlRepository","user created in sql")
    }
}

class FireBaseRepository @Inject constructor():UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d("FireBaseRepository","user created in firebase")
    }
}