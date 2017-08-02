package io.bratexsoft.data

import io.bratexsoft.domain.entity.Station
import io.bratexsoft.domain.gateway.StationGateway
import io.bratexsoft.domain.usecase.base.CallbackData

class StationClientRequestManager : RequestManager<Station, Unit>, StationGateway {


    override fun getStationList(callbackData: CallbackData<List<Station>>) {
        if (shouldFetch()) {
            createCall(Unit)
        }
    }

    override fun createCall(item: Unit): Station {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun saveCallResultToDb(item: Station) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun shouldFetch(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadFromDb(): Station {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFetchFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}