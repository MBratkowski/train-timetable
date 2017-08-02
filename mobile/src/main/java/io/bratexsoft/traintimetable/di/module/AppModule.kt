package io.bratexsoft.traintimetable.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import io.bratexsoft.data.DataRepositoryFactory
import io.bratexsoft.domain.DataRepository
import io.bratexsoft.domain.UseCaseFactory
import javax.inject.Singleton

@Module
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideDataRepository(): DataRepository = DataRepositoryFactory()

    @Provides
    @Singleton
    fun provideUseCaseFactory(dataRepository: DataRepository) = UseCaseFactory(dataRepository)
}