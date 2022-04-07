package com.example.nordapp.data.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "server")
data class Server(
    var quantity: String? = null,
    @NonNull
    @PrimaryKey var value: String

)