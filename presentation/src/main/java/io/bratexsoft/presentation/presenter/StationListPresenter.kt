package io.bratexsoft.presentation.presenter

import io.bratexsoft.domain.UseCaseFactory
import io.bratexsoft.domain.entity.StationDefinition
import io.bratexsoft.presentation.ViewType
import io.bratexsoft.presentation.base.BasePresenter
import io.bratexsoft.presentation.contract.CollectionContract
import io.bratexsoft.presentation.contract.StationListContract
import io.bratexsoft.presentation.viewmodel.StationItem
import java.util.*

class StationListPresenter(val useCaseFactory: UseCaseFactory) : BasePresenter<StationListContract.View>(), StationListContract.Presenter {

    var stationList: ArrayList<ViewType> = ArrayList()

    override fun getCollectionSize(): Int = stationList.size

    override fun getItem(position: Int): StationItem {
        return stationList.get(position) as StationItem
    }

    override fun onTakenView(view: StationListContract.View) {
        super.onTakenView(view)
        useCaseFactory.getStationListUseCase(DataCallback(this)).execute()
    }

    override fun bindResult(result: List<ViewType>) {
        stationList = result as ArrayList<ViewType>
        view?.onDataLoaded()
    }

    override fun bindError(message: String) {
        view?.onDataError(message)
    }

    private class DataCallback(val presenter: CollectionContract<StationItem>) : io.bratexsoft.domain.usecase.base.CallbackData<List<StationDefinition>> {

        override fun onSuccess(data: List<StationDefinition>) {
            val items: ArrayList<ViewType> = ArrayList<ViewType>()
            data.forEach {
                items.add(StationItem(it.getStationName()))
            }
            presenter.bindResult(items)
        }

        override fun onError(message: String) {
            presenter.bindError(message)
        }

    }
}