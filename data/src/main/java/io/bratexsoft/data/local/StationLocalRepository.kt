package io.bratexsoft.data.local

import io.bratexsoft.data.local.dao.StationDao
import io.bratexsoft.data.local.entity.StationLocalData
import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.domain.gateway.StationGateway
import io.bratexsoft.domain.usecase.base.CallbackData

class StationLocalRepository constructor(private val stationDao: StationDao) : StationGateway {

    override fun getStationList(callbackData: CallbackData<List<StationDefinition>>) {
        val stationList: List<StationLocalData> = stationDao.getStations()
        if (stationList.isEmpty()) {
            //callbackData.onSuccess(stationList)
        } else {
            callbackData.onError("Empty stations")
        }
    }

    fun saveStationList(stationList: List<StationDefinition>) {
        //stationDao.insertAll(stationList)
    }

}