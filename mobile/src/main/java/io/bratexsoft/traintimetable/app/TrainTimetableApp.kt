package io.bratexsoft.traintimetable.app

import android.app.Application

class TrainTimetableApp : Application() {


    override fun onCreate() {
        super.onCreate()
        TrainTimetableInjector.INSTANCE.app = this
        TrainTimetableInjector.INSTANCE.appComponent.inject(this)
    }
}