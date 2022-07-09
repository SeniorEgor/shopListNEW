package com.example.shoplistnew.data.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "shopping_list_names")
data class ShoppingListNames(

    @PrimaryKey(autoGenerate = true) // автозаполнение индефикаторов
    val id: Int?,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "time")
    val time: String,

    @ColumnInfo(name = "allTimeCounter") // кол-во элементов
    val allTimeCount: Int,

    @ColumnInfo(name = "checkedItemsCounter") // кол-во элементов которые уже куплены
    val checkedItemsCounter: Int,

    @ColumnInfo(name = "itemsIds") // список всех Id
    val itemsIds: String,
):Serializable
