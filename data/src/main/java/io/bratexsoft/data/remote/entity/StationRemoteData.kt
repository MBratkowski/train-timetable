package io.bratexsoft.data.remote.entity

import io.bratexsoft.domain.entity.StationDefinition

data class StationRemoteData(val name: String, val id: Int) : StationDefinition {
    override fun getStationId(): Int {
        return id
    }

    override fun getStationName(): String {
        return name
    }
}