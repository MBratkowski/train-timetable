package io.bratexsoft.traintimetable.adapter.utils

import android.databinding.ViewDataBinding
import android.view.ViewGroup
import io.bratexsoft.presentation.ViewType
import io.bratexsoft.traintimetable.adapter.BaseViewHolder

interface ViewTypeDelegateAdapter<B : ViewDataBinding> {
    fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder<B>

    fun onBindViewHolder(holder: BaseViewHolder<*>, item: ViewType)
}