package com.example.fakerapidagger

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FakerApplication:Application() {


    override fun onCreate() {
        super.onCreate()

    }
}