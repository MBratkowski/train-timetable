package io.bratexsoft.traintimetable.di.component

import dagger.Component
import io.bratexsoft.traintimetable.di.module.ActivityModule
import io.bratexsoft.traintimetable.di.module.MainModule
import io.bratexsoft.traintimetable.di.module.StationListModule
import io.bratexsoft.traintimetable.di.scope.ActivityScope

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun plusMainModule(module: MainModule): MainComponent

    fun plusStationListModule(module: StationListModule): StationListComponent
}