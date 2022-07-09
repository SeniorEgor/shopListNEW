package com.example.shoplistnew.data.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shoplistnew.data.room.entities.LibraryItem
import com.example.shoplistnew.data.room.entities.NoteItem
import com.example.shoplistnew.data.room.entities.ShoppingListNames
import com.example.shoplistnew.data.room.entities.ShoppingListItem

@Database(entities = [LibraryItem::class,NoteItem::class,
    ShoppingListNames::class,ShoppingListItem::class], version = 1)
abstract class MainDataBase : RoomDatabase() {

    companion object {
        @Volatile
        private var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context):MainDataBase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "shopping_list_db"
                ).build()
                instance
            }
        }
    }
}