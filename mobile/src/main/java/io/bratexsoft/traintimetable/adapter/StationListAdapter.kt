package io.bratexsoft.traintimetable.adapter

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import io.bratexsoft.presentation.AdapterConstants
import io.bratexsoft.presentation.ViewType
import io.bratexsoft.presentation.presenter.StationListPresenter
import io.bratexsoft.traintimetable.adapter.delegate.LoadingDelegateAdapter
import io.bratexsoft.traintimetable.adapter.delegate.StationListDelegateAdapter
import io.bratexsoft.traintimetable.adapter.utils.ViewTypeDelegateAdapter

class StationListAdapter(val presenter: StationListPresenter) : RecyclerView.Adapter<BaseViewHolder<*>>() {

    private val loadingItem = object : ViewType {
        override fun getViewType(): Int = AdapterConstants.LOADING
    }
    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter<*>>()

    init {
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
        delegateAdapters.put(AdapterConstants.STATION, StationListDelegateAdapter())

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, presenter.getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return presenter.getItem(position).getViewType()
    }

    override fun getItemCount(): Int {
        return presenter.getCollectionSize()
    }
}