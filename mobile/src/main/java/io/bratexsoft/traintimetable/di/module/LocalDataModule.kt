package io.bratexsoft.traintimetable.di.module

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import io.bratexsoft.data.local.client.AppDatabase
import javax.inject.Singleton


@Module
class LocalDataModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "traintimetable-database").build();
    }
}