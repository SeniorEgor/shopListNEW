package com.example.shoplistnew.data.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_list_item")
data class ShoppingListItem(

    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "ítemInfo")
    val itemInfo: String?,

    @ColumnInfo(name = "itemChecked") //куплен ли продукт
    val itemChecked: Int = 0,

    @ColumnInfo(name = "listId")
    val listId: Int,

    @ColumnInfo(name = "itemType")
    val itemType: String = "item",
)
