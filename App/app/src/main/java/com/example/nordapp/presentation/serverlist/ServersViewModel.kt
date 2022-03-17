package com.example.nordapp.presentation.serverlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.nordapp.data.repository.ServerListRepository
import com.example.nordapp.util.Resource
import dagger.hilt.android.scopes.ViewModelScoped

class ServersViewModel @ViewModelScoped  constructor(
    private val repository: ServerListRepository
): ViewModel() {
    val serverlist: LiveData<Resource<List<Character>>> = repository.getServerList()
}