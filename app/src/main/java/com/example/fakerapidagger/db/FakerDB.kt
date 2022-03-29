package com.example.fakerapidagger.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fakerapidagger.models.Products

@Database(entities = [Products::class], version = 1)
abstract class FakerDB:RoomDatabase() {

    abstract fun fakerDao():Dao


}