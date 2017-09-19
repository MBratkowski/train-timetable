package io.bratexsoft.data.local.client

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import io.bratexsoft.data.local.dao.StationDao
import io.bratexsoft.data.local.entity.StationLocalData

@Database(entities = arrayOf(StationLocalData::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun stationDao(): StationDao
}