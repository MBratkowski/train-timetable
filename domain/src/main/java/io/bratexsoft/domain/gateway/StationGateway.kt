package io.bratexsoft.domain.gateway

import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.domain.usecase.base.CallbackData

interface StationGateway {
    fun getStationList(callbackData: CallbackData<List<StationDefinition>>): Unit
}