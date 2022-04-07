package com.example.nordapp.data

import android.provider.SyncStateContract
import com.example.nordapp.data.TesonetAppService.Companion.LOGIN_URL
import com.example.nordapp.data.model.LoginRequest
import com.example.nordapp.data.model.LoginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface TesonetAppService {
    companion object {
        const val ENDPOINT = " http://playground.tesonet.lt/v1/"
        const val LOGIN_URL = " http://playground.tesonet.lt/v1/tokens"
    }

//
//    @GET("servers")
//    suspend fun getServersList(@Query("api_key") apikey:String?):Response<ServersResponse>

    @POST(LOGIN_URL)
    @FormUrlEncoded
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}