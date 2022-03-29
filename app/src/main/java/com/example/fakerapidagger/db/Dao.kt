package com.example.fakerapidagger.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.fakerapidagger.models.Products

@Dao
interface Dao {

    @Insert
    suspend fun addProducts(products:List<Products>)

    @Query("SELECT * FROM PRODUCTS")
    suspend fun getProducts():List<Products>
}