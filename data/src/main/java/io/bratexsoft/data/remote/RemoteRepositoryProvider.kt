package io.bratexsoft.data.remote

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteRepositoryProvider @Inject constructor() {
    fun provideRemoteRepositoryProvider(): StationRemoteRepository {
        return StationRemoteRepository()
    }

}