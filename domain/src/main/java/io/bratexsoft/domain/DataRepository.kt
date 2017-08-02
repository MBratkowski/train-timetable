package io.bratexsoft.domain

import io.bratexsoft.domain.gateway.StationGateway

interface DataRepository {
    fun provideStationGateway(): StationGateway
}