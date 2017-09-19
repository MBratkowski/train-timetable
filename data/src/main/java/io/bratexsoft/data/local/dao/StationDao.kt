package io.bratexsoft.data.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.bratexsoft.data.local.entity.StationLocalData

@Dao
interface StationDao {

    @Query("SELECT * FROM stations")
    fun getStations(): List<StationLocalData>
}