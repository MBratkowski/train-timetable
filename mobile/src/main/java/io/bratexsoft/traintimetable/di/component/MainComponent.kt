package io.bratexsoft.traintimetable.di.component

import dagger.Subcomponent
import io.bratexsoft.traintimetable.activity.MainActivity
import io.bratexsoft.traintimetable.di.module.MainModule
import io.bratexsoft.traintimetable.di.scope.PerView

@PerView
@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}