package io.bratexsoft.traintimetable.app

import android.app.Application
import io.bratexsoft.traintimetable.di.component.AppComponent
import io.bratexsoft.traintimetable.di.component.DaggerAppComponent
import io.bratexsoft.traintimetable.di.module.AppModule

enum class TrainTimetableInjector {
    INSTANCE;

    lateinit var app: Application

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(app))
                .build()
    }
}