package com.example.nordapp.data.remote

import javax.inject.Inject

class ServerListRemoteDataSource @Inject constructor(
    private val serverService: ServerListService
): BaseDataSource() {

    suspend fun getServers() = getResult { serverService.getAllCharacters() }
    suspend fun getCharacter(id: Int) = getResult { serverService.getCharacter(id) }