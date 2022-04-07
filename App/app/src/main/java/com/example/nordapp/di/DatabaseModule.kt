package com.example.nordapp.di

import android.app.Application
import androidx.room.Room
import com.example.nordapp.data.local.TesonetAppDao
import com.example.nordapp.data.local.TesonetAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application, callback: TesonetAppDatabase.Callback): TesonetAppDatabase{
        return Room.databaseBuilder(application, TesonetAppDatabase::class.java, "alpha_database")
            .fallbackToDestructiveMigration()
            .addCallback(callback)
            .build()
    }

    @Provides
    fun provideMovieAppDao(db: TesonetAppDatabase): TesonetAppDao {
        return db.getTesonetAppDao()
    }
}