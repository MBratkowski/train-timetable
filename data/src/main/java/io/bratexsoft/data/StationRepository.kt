package io.bratexsoft.data

import io.bratexsoft.domain.entity.Station
import io.bratexsoft.domain.gateway.StationGateway
import io.bratexsoft.domain.usecase.base.CallbackData

class StationRepository constructor() : StationGateway {

    override fun getStationList(callbackData: CallbackData<List<Station>>) {
        val stations = listOf(Station("Warszawa"), Station("Krakow"), Station("Bukowno"))
        callbackData.onSuccess(stations)
    }

}