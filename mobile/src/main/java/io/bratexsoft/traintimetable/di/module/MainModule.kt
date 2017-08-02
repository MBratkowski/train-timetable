package io.bratexsoft.traintimetable.di.module

import dagger.Module
import dagger.Provides
import io.bratexsoft.presentation.presenter.MainPresenter
import io.bratexsoft.traintimetable.di.scope.PerView

@Module
class MainModule() {

    @PerView
    @Provides
    fun provideMainPresenter(): MainPresenter = MainPresenter()
}