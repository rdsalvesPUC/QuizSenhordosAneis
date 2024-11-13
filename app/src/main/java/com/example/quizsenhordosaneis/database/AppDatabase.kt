package com.example.quizsenhordosaneis.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.quizsenhordosaneis.dao.JogadorDao
import com.example.quizsenhordosaneis.data.Jogador

@Database(entities = [Jogador::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun jogadorDao(): JogadorDao
}