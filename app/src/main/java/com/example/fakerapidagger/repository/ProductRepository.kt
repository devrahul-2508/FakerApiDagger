package com.example.fakerapidagger.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.fakerapidagger.models.Products
import com.example.fakerapidagger.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI){

    private val _products=MutableLiveData<List<Products>>()
    val products:LiveData<List<Products>>
    get() = _products
    suspend fun getProducts(){
        val result=fakerAPI.getProducts()
        if (result.isSuccessful && result.body()!=null){
            _products.postValue(result.body())
        }
    }
}