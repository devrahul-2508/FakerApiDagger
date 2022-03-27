package com.example.fakerapidagger

import android.app.Application
import com.example.fakerapidagger.di.ApplicationComponent
import com.example.fakerapidagger.di.DaggerApplicationComponent

class FakerApplication:Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent=DaggerApplicationComponent.builder().build()
    }
}