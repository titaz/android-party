package com.example.nordapp.data.model

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("message")
    var token: String,
)