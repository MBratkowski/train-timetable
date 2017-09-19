package io.bratexsoft.data

import io.bratexsoft.data.local.StationLocalRepository
import io.bratexsoft.data.remote.StationRemoteRepository
import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.domain.gateway.StationGateway
import io.bratexsoft.domain.usecase.base.CallbackData

class StationRepository constructor(val stationLocalRepository: StationLocalRepository,
                                    val stationRemoteRepository: StationRemoteRepository) : StationGateway {
    override fun getStationList(callbackData: CallbackData<List<StationDefinition>>) {
        stationRemoteRepository.getStationList(callbackData)
    }
}