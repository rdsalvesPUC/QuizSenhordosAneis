package com.example.quizsenhordosaneis.view

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.runtime.*
import androidx.compose.ui.text.style.TextAlign
import com.example.quizsenhordosaneis.R
import com.example.quizsenhordosaneis.ui.theme.CustomTypography

@Composable
fun TelaInicial(onStartQuiz: (String) -> Unit, onLeaderboardClick: () -> Unit) {
    var nomeUsuario by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Cabeçalho com botão de voltar e título do quiz
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Quiz do Senhor dos Anéis", style = CustomTypography.headlineSmall)
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = onLeaderboardClick) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_leaderboard),
                    contentDescription = "Leaderboard",
                    tint = Color(0xFF2E8B57)
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        // Imagem circular
        Image(
            painter = painterResource(id = R.drawable.imagem_entrada),
            contentDescription = null,
            modifier = Modifier
                .size(338.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(48.dp))

        // Título do Quiz
        Text(
            text = "Senhor dos Aneis Quiz",
            style = CustomTypography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Subtítulo
        Text(
            text = "Teste seus conhecimentos sobre a Terra Média",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Campo de entrada para o nome do usuário
        OutlinedTextField(
            value = nomeUsuario,
            onValueChange = { nomeUsuario = it },
            label = { Text("Digite seu nome") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Botão Iniciar
        Button(
            onClick = { onStartQuiz(nomeUsuario) },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2E8B57))
        ) {
            Text(
                text = "Iniciar Quiz",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}