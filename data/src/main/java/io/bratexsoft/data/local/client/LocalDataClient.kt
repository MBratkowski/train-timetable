package io.bratexsoft.data.local.client

import io.bratexsoft.data.local.StationLocalRepository
import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.domain.gateway.StationGateway
import io.bratexsoft.domain.usecase.base.CallbackData

class LocalDataClient constructor(private val stationLocalRepository: StationLocalRepository) : StationGateway {

    override fun getStationList(callbackData: CallbackData<List<StationDefinition>>) {
        stationLocalRepository.getStationList(callbackData)
    }
}