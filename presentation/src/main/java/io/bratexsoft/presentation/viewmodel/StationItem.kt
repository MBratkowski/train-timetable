package io.bratexsoft.presentation.viewmodel

import io.bratexsoft.presentation.AdapterConstants
import io.bratexsoft.presentation.ViewType


data class StationItem(val cityName: String) : ViewType {
    override fun getViewType(): Int {
        return AdapterConstants.STATION
    }
}