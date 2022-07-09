package com.example.shoplistnew.presentation.activities

import android.app.Application
import com.example.shoplistnew.data.room.db.MainDataBase

class MainApp:Application() {
    val dataBase by lazy { MainDataBase.getDataBase(this) }
}