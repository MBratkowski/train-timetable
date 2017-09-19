package io.bratexsoft.data

import io.bratexsoft.data.local.LocalRepositoryProvider
import io.bratexsoft.data.remote.RemoteRepositoryProvider
import io.bratexsoft.domain.DataRepository
import io.bratexsoft.domain.gateway.StationGateway

class DataRepositoryFactory constructor(private val localRepositoryProvider: LocalRepositoryProvider,
                                        private val remoteRepositoryProvider: RemoteRepositoryProvider) : DataRepository {

    override fun provideStationGateway(): StationGateway = StationRepository(localRepositoryProvider.provideStationRepository(),
            remoteRepositoryProvider.provideRemoteRepositoryProvider())
}