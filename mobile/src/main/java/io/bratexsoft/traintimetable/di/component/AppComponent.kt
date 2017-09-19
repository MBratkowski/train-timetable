package io.bratexsoft.traintimetable.di.component

import dagger.Component
import io.bratexsoft.domain.UseCaseFactory
import io.bratexsoft.traintimetable.app.TrainTimetableApp
import io.bratexsoft.traintimetable.di.module.AppModule
import io.bratexsoft.traintimetable.di.module.LocalDataModule
import io.bratexsoft.traintimetable.di.module.RemoteDataModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, LocalDataModule::class, RemoteDataModule::class))
interface AppComponent {

    fun useCaseFactory(): UseCaseFactory

    fun inject(app: TrainTimetableApp)
}