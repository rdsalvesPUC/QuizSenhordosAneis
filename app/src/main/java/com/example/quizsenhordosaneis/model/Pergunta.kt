package com.example.quizsenhordosaneis.model

data class Pergunta(
    val id: String,
    val texto: String,
    val opcoes: List<String>,
    val respostaCorreta: String,
    val imagem: String
)