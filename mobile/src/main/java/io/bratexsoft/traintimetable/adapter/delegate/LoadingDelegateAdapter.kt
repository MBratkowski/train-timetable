package io.bratexsoft.traintimetable.adapter.delegate

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import io.bratexsoft.presentation.ViewType
import io.bratexsoft.traintimetable.R
import io.bratexsoft.traintimetable.adapter.BaseViewHolder
import io.bratexsoft.traintimetable.adapter.utils.ViewTypeDelegateAdapter
import io.bratexsoft.traintimetable.databinding.ItemLoadingBinding

class LoadingDelegateAdapter : ViewTypeDelegateAdapter<ItemLoadingBinding> {

    override fun onBindViewHolder(holder: BaseViewHolder<*>, item: ViewType) = Unit

    override fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<ItemLoadingBinding> = BaseViewHolder(DataBindingUtil
            .inflate(LayoutInflater.from(parent.context),
                    R.layout.item_loading,
                    parent,
                    false))
}