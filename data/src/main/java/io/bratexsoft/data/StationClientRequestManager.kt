package io.bratexsoft.data

class StationClientRequestManager constructor(private val stationRepository: StationRepository) {

    /*lateinit var callback: CallbackData<List<StationDefinition>>

    override fun getStationList(callbackData: CallbackData<List<StationDefinition>>) {
        this.callback = callbackData
        if (shouldFetch()) {
            createCall(Unit)
        } else {
            loadFromDb()
        }
    }

    override fun createCall(item: Unit): List<StationDefinition> {
        stationRepository.stationRemoteRepository.getStationList(callback)
    }

    override fun saveCallResultToDb(item: List<StationDefinition>) {
        stationRepository.stationLocalRepository.saveStationList(item)
    }

    override fun shouldFetch(): Boolean {
        return true
    }

    override fun loadFromDb(): List<StationDefinition> {
        stationRepository.stationLocalRepository.getStationList(callback)
    }

    override fun onFetchFailed() {
    }*/
}