package io.bratexsoft.domain.usecase.base

import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.domain.gateway.StationGateway

class StationListUseCase(val gateway: StationGateway, callbackData: CallbackData<List<StationDefinition>>) : BaseUseCase<Unit, List<StationDefinition>>((callbackData)) {
    override fun execute() {
        gateway.getStationList(callbackData)
    }
}