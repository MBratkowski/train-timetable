package io.bratexsoft.traintimetable.adapter.delegate

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import io.bratexsoft.presentation.ViewType
import io.bratexsoft.presentation.viewmodel.StationItem
import io.bratexsoft.traintimetable.BR
import io.bratexsoft.traintimetable.R
import io.bratexsoft.traintimetable.adapter.BaseViewHolder
import io.bratexsoft.traintimetable.adapter.utils.ViewTypeDelegateAdapter
import io.bratexsoft.traintimetable.databinding.ItemStationBinding

class StationListDelegateAdapter : ViewTypeDelegateAdapter<ItemStationBinding> {

    override fun onBindViewHolder(holder: BaseViewHolder<*>, item: ViewType) {
        val itemStationBinding: ItemStationBinding = holder.binding as ItemStationBinding
        val viewModel = item as StationItem
        itemStationBinding.setVariable(BR.stationName, viewModel.cityName)
        itemStationBinding.executePendingBindings()
    }

    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<ItemStationBinding> = BaseViewHolder(DataBindingUtil
            .inflate(LayoutInflater.from(parent.context),
                    R.layout.item_station,
                    parent,
                    false))

}