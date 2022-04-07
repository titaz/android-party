package com.example.nordapp.data.entities

import androidx.room.Entity

@Entity(tableName = "server")
data class Server(
    val Name:String,
    val distance:String,
)