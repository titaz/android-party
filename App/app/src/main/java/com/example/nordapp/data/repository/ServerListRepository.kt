package com.example.nordapp.data.repository

import com.example.nordapp.data.local.ServerDao
import com.example.nordapp.data.remote.ServerListRemoteDataSource
import com.example.nordapp.util.performGetOperation
import javax.inject.Inject

class ServerListRepository @Inject constructor(
    private val remoteDataSource: ServerListRemoteDataSource,
    private val localDataSource: ServerDao
) {
    fun getServers(id: Int) = performGetOperation(
        databaseQuery = { localDataSource.getAllServers() },
        networkCall = { remoteDataSource.getCharacter(id) },
        saveCallResult = { localDataSource.insert(it) }
    )

    fun getServers() = performGetOperation(
        databaseQuery = { localDataSource.getAllServers() },
        networkCall = { remoteDataSource.getCharacters() },
        saveCallResult = { localDataSource.insertAll(it.results) }
    )
}