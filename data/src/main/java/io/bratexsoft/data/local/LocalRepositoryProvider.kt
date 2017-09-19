package io.bratexsoft.data.local

import io.bratexsoft.data.local.client.AppDatabase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalRepositoryProvider @Inject constructor(private val databae: AppDatabase) {
    fun provideStationRepository(): StationLocalRepository {
            return StationLocalRepository(databae.stationDao())
    }
}