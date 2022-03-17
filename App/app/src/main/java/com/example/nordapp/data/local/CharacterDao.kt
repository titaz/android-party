package com.example.nordapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface class ServerDao {
    @Query("SELECT * FROM server")
    fun getAllServers() : LiveData<List<Character>>
}