package com.example.fakerapidagger.di

import android.content.Context
import androidx.room.Room
import com.example.fakerapidagger.db.FakerDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideFakerDB(@ApplicationContext context:Context):FakerDB{
        return Room.databaseBuilder(
            context,
            FakerDB::class.java,
            "FakerDB"
        ).build()
    }
}