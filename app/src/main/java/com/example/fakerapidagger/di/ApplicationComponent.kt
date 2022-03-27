package com.example.fakerapidagger.di

import com.example.fakerapidagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}