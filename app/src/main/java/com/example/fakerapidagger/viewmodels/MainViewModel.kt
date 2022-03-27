package com.example.fakerapidagger.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fakerapidagger.models.Products
import com.example.fakerapidagger.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(val repository: ProductRepository):ViewModel() {

    val productsLiveData:LiveData<List<Products>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }

    }
}