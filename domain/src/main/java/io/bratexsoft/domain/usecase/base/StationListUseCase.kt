package io.bratexsoft.domain.usecase.base

import io.bratexsoft.domain.entity.Station
import io.bratexsoft.domain.gateway.StationGateway

class StationListUseCase(val gateway: StationGateway, callbackData: CallbackData<List<Station>>) : BaseUseCase<Unit, List<Station>>((callbackData)) {
    override fun execute() {
        gateway.getStationList(callbackData)
    }
}