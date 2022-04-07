package com.example.nordapp.data.remote;

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ServerListService {
    @GET("character")
    suspend fun getAllCharacters() : Response<Server>
}