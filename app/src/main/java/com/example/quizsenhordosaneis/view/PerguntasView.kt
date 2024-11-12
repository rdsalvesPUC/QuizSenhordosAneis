package com.example.quizsenhordosaneis.view

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import com.example.quizsenhordosaneis.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizsenhordosaneis.ui.theme.CustomTypography
import kotlin.math.roundToInt

@Composable
fun TelaPerguntas(
    pergunta: String,
    opcoes: List<String>,
    imagemResId: Int,
    tempoRestante: Int,
    onOptionSelected: (String) -> Unit,
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Cabeçalho com botão de voltar e título do quiz
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = onBackClick) {
                Icon(
                    painter = painterResource(id = R.drawable.leadingicon),
                    contentDescription = "Voltar"
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Quiz 1", style = CustomTypography.headlineSmall)
            Spacer(modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Texto da pergunta
        Text(
            text = pergunta,
            style = CustomTypography.headlineLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Imagem da pergunta
        Image(
            painter = painterResource(id = imagemResId),
            contentDescription = "Imagem da Pergunta",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Temporizador circular
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Respostas",
                    style = CustomTypography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Escolha a resposta correta",
                    style = CustomTypography.bodySmall,
                    color = Color.Gray
                )
            }
            CircularProgressIndicator(
                progress = { tempoRestante / 60f },
                modifier = Modifier.size(56.dp),
                color = Color(0xFF4CAF50),
                strokeWidth = 4.dp,
                trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
            )
            Text(
                text = "${tempoRestante}s",
                style = CustomTypography.headlineMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Lista de opções de resposta
        opcoes.forEachIndexed { index, opcao ->
            val letra = 'a' + index
            Card(
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF3F3F3)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { onOptionSelected(opcao) }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = letra.toString(),
                        style = CustomTypography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color(0xFF2E8B57), CircleShape)
                            .wrapContentSize(Alignment.Center)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = opcao,
                        style = CustomTypography.bodyLarge
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTelaPerguntas() {
    TelaPerguntas(
        pergunta = "Qual é o nome do personagem principal?",
        opcoes = listOf("Frodo", "Aragorn", "Gandalf", "Legolas"),
        imagemResId = R.drawable.imagem_entrada,
        tempoRestante = 30,
        onOptionSelected = {},
        onBackClick = {}
    )
}
