package com.example.quizsenhordosaneis.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizsenhordosaneis.data.Jogador
import com.example.quizsenhordosaneis.database.DatabaseProvider
import com.example.quizsenhordosaneis.model.Pergunta
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

class PerguntasViewModel(application: Application) : AndroidViewModel(application) {
    private val database = DatabaseProvider.getDatabase(application)
    private val _currentQuestionIndex = MutableStateFlow(0)
    val currentQuestionIndex: StateFlow<Int> = _currentQuestionIndex

    private val _tempoRestante = MutableStateFlow(60)
    val tempoRestante: StateFlow<Int> = _tempoRestante

    private val _perguntas = MutableStateFlow<List<Pergunta>>(emptyList())
    val perguntas: StateFlow<List<Pergunta>> = _perguntas

    private var totalPontos = 0
    private var userName = ""
    private var onQuizComplete: (() -> Unit)? = null
    private var isTimerRunning = false

    fun setPerguntas(perguntas: List<Pergunta>, userName: String, onQuizComplete: () -> Unit) {
        _perguntas.value = perguntas
        this.userName = userName
        this.onQuizComplete = onQuizComplete
        _currentQuestionIndex.value = 0
        totalPontos = 0
        startTimer()
    }

    private fun startTimer() {
        if (isTimerRunning) return
        isTimerRunning = true
        viewModelScope.launch {
            while (_tempoRestante.value > 0) {
                delay(1000L)
                _tempoRestante.value -= 1
            }
            isTimerRunning = false
            nextQuestion()
        }
    }

    fun nextQuestion() {
        if (_currentQuestionIndex.value < _perguntas.value.size - 1) {
            _currentQuestionIndex.value += 1
            _tempoRestante.value = 60
            startTimer()
        } else {
            saveScore {
                onQuizComplete?.invoke()
            }
        }
    }

    fun answerQuestion() {
        totalPontos += _tempoRestante.value * 10
        _tempoRestante.value = 0
        nextQuestion()
    }

    private fun saveScore(onScoreSaved: () -> Unit) {
        viewModelScope.launch {
            val existingJogador = database.jogadorDao().getJogadorByName(userName)
            if (existingJogador == null) {
                val jogador = Jogador(nome = userName, pontos = totalPontos)
                database.jogadorDao().insert(jogador)
            } else {
                val updatedJogador = existingJogador.copy(pontos = totalPontos)
                database.jogadorDao().insert(updatedJogador)
            }
            onScoreSaved()
        }
    }
}