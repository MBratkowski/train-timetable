package io.bratexsoft.traintimetable.di.component

import dagger.Subcomponent
import io.bratexsoft.traintimetable.activity.StationListActivity
import io.bratexsoft.traintimetable.di.module.StationListModule
import io.bratexsoft.traintimetable.di.scope.PerView

@PerView
@Subcomponent(modules = arrayOf(StationListModule::class))
interface StationListComponent {
    fun injectStationListActivity(stationListActivity: StationListActivity)
}