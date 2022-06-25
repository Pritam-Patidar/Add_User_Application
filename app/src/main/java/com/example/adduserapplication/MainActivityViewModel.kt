package com.example.adduserapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.adduserapplication.db.RoomAppDb

class MainActivityViewModel (app: Application): AndroidViewModel(app) {
    init {

    }

    fun getAllUsers(){
       val userDao = RoomAppDb.getAppDatabase((getApplication()))?.userDao()

//
    }
}

