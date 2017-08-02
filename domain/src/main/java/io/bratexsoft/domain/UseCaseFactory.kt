package io.bratexsoft.domain

import io.bratexsoft.domain.entity.Station
import io.bratexsoft.domain.usecase.base.CallbackData
import io.bratexsoft.domain.usecase.base.StationListUseCase

class UseCaseFactory(val dataRepository: DataRepository) {
    fun getStationListUseCase(callbackData: CallbackData<List<Station>>) = StationListUseCase(dataRepository.provideStationGateway(), callbackData)
}