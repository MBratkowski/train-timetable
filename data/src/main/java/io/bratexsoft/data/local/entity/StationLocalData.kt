package io.bratexsoft.data.local.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "stations")
data class StationLocalData constructor(val stationName: String,
                                        @PrimaryKey(autoGenerate = true) val id: Int)