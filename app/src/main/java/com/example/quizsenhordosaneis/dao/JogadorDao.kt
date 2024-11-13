package com.example.quizsenhordosaneis.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.quizsenhordosaneis.data.Jogador

@Dao
interface JogadorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(jogador: Jogador)

    @Query("SELECT * FROM jogadores WHERE nome = :nome LIMIT 1")
    suspend fun getJogadorByName(nome: String): Jogador?

    @Query("SELECT * FROM jogadores ORDER BY pontos DESC LIMIT 10")
    suspend fun getAllJogadores(): List<Jogador>

    @Query("DELETE FROM jogadores")
    suspend fun deleteAllJogadores()
}