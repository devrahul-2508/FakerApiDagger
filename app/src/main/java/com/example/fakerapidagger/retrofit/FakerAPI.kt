package com.example.fakerapidagger.retrofit

import com.example.fakerapidagger.models.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
     suspend fun getProducts(): Response<List<Products>>

}