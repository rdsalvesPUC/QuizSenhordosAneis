package com.example.quizsenhordosaneis.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizsenhordosaneis.R
import com.example.quizsenhordosaneis.ui.theme.CustomTypography
import com.example.quizsenhordosaneis.viewmodel.LeaderboardViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quizsenhordosaneis.data.Jogador


@Composable
fun TelaLeaderboard(
    onBackClick: () -> Unit,
    viewModel: LeaderboardViewModel = viewModel()
) {
    val jogadores by viewModel.jogadoresList.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Cabeçalho com botão de voltar e título
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = onBackClick) {
                Icon(
                    painter = painterResource(id = R.drawable.leadingicon),
                    contentDescription = "Voltar",
                    tint = Color(0xFF2E8B57)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Leaderboard",
                style = CustomTypography.headlineSmall,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

//        Button(onClick = { viewModel.clearAndRepopulateDatabase() }) {
//            Text(text = "Limpar Banco de Dados")
//        }

        // Lista de jogadores com posição, nome e pontuação
        LazyColumn {
            items(jogadores.sortedByDescending { it.pontos }) { jogador ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .background(Color(0xFFF3F3F3), RoundedCornerShape(24.dp))
                        .padding(end = 16.dp)
                        .height(48.dp)
                ) {
                    // Posição do jogador
                    Text(
                        text = "${jogadores.indexOf(jogador) + 1}",
                        color = Color.White,
                        style = CustomTypography.headlineSmall,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .size(48.dp)
                            .background(Color(0xFF2E8B57), CircleShape)
                            .wrapContentSize(Alignment.Center)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    // Nome do jogador
                    Text(
                        text = jogador.nome,
                        style = CustomTypography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f)
                    )

                    // Pontuação do jogador
                    Text(
                        text = "${jogador.pontos} pontos",
                        style = MaterialTheme.typography.bodyLarge,
                        textAlign = TextAlign.End
                    )
                }
            }
        }
    }
}