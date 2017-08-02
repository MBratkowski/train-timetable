package io.bratexsoft.traintimetable.di.module

import dagger.Module
import dagger.Provides
import io.bratexsoft.domain.UseCaseFactory
import io.bratexsoft.presentation.presenter.StationListPresenter
import io.bratexsoft.traintimetable.adapter.StationListAdapter
import io.bratexsoft.traintimetable.di.scope.PerView

@Module
class StationListModule {

    @Provides
    @PerView
    fun provideStationListPresenter(useCaseFactory: UseCaseFactory): StationListPresenter = StationListPresenter(useCaseFactory)

    @Provides
    @PerView
    fun provideStationListAdapter(presenter: StationListPresenter) = StationListAdapter(presenter)
}