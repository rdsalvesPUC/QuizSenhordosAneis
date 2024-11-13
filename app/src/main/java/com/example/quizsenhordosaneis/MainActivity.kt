package com.example.quizsenhordosaneis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quizsenhordosaneis.ui.theme.QuizSenhordosAneisTheme
import com.example.quizsenhordosaneis.view.TelaInicial
import com.example.quizsenhordosaneis.view.TelaPerguntas
import com.example.quizsenhordosaneis.quiz.QuizData
import com.example.quizsenhordosaneis.model.Pergunta
import com.example.quizsenhordosaneis.view.TelaLeaderboard
import com.example.quizsenhordosaneis.viewmodel.LeaderboardViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizSenhordosAneisTheme {
                var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }
                var selectedQuiz by remember { mutableStateOf(QuizData.quizzes.random()) }
                var userName by remember { mutableStateOf("") }
                val leaderboardViewModel: LeaderboardViewModel = viewModel()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    when (currentScreen) {
                        is Screen.Home -> TelaInicial(
                            onStartQuiz = { name ->
                                userName = name
                                selectedQuiz = QuizData.quizzes.random()
                                currentScreen = Screen.Quiz(selectedQuiz.perguntas)
                            },
                            onLeaderboardClick = { currentScreen = Screen.Leaderboard }
                        )
                        is Screen.Quiz -> TelaPerguntas(
                            perguntas = (currentScreen as Screen.Quiz).perguntas,
                            userName = userName,
                            onBackClick = { currentScreen = Screen.Home },
                            onQuizComplete = {
                                leaderboardViewModel.fetchJogadores()
                                currentScreen = Screen.Leaderboard
                            },
                            leaderboardViewModel = leaderboardViewModel
                        )
                        is Screen.Leaderboard -> TelaLeaderboard(
                            onBackClick = { currentScreen = Screen.Home }
                        )
                    }
                }
            }
        }
    }
}

sealed class Screen {
    object Home : Screen()
    data class Quiz(val perguntas: List<Pergunta>) : Screen()
    object Leaderboard : Screen()
}