package com.example.nordapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.nordapp.data.model.Server
import com.example.nordapp.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Server::class], version = 1)
abstract class TesonetAppDatabase : RoomDatabase() {

    abstract fun getTesonetAppDao(): TesonetAppDao

    class Callback @Inject constructor(
        private val database: Provider<TesonetAppDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback()
}