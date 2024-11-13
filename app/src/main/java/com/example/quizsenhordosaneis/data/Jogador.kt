package com.example.quizsenhordosaneis.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jogadores")
data class Jogador(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String,
    val pontos: Int
)