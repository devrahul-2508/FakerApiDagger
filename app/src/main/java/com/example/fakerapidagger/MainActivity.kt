package com.example.fakerapidagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.fakerapidagger.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel



    private val products:TextView
    get() = findViewById(R.id.products)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel= ViewModelProvider(this)[MainViewModel::class.java]

        mainViewModel.productsLiveData.observe(this){
            products.text=it.joinToString { x-> x.title +"\n\n" }
        }
    }
}