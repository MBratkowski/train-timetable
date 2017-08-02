package io.bratexsoft.data

import io.bratexsoft.domain.DataRepository
import io.bratexsoft.domain.gateway.StationGateway

class DataRepositoryFactory() : DataRepository {
    override fun provideStationGateway(): StationGateway = StationRepository()
}