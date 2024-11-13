package com.example.quizsenhordosaneis.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import com.example.quizsenhordosaneis.database.AppDatabase
import com.example.quizsenhordosaneis.database.DatabaseProvider
import com.example.quizsenhordosaneis.data.Jogador

class LeaderboardViewModel(application: Application) : AndroidViewModel(application) {
    private val database: AppDatabase = DatabaseProvider.getDatabase(application)
    private val _jogadoresList = MutableStateFlow<List<Jogador>>(emptyList())
    val jogadoresList: StateFlow<List<Jogador>> = _jogadoresList

    init {
        fetchJogadores()
    }

    fun fetchJogadores() {
        viewModelScope.launch {
            _jogadoresList.value = database.jogadorDao().getAllJogadores()
        }
    }

    fun clearAndRepopulateDatabase() {
        viewModelScope.launch {
            database.jogadorDao().deleteAllJogadores()
            // Adicione aqui a lógica para re-popular o banco de dados, se necessário
        }
    }
}