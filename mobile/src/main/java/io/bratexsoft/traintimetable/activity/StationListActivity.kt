package io.bratexsoft.traintimetable.activity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import io.bratexsoft.presentation.contract.StationListContract
import io.bratexsoft.presentation.presenter.StationListPresenter
import io.bratexsoft.traintimetable.R
import io.bratexsoft.traintimetable.adapter.StationListAdapter
import io.bratexsoft.traintimetable.databinding.ActivityStationListBinding
import io.bratexsoft.traintimetable.di.component.ActivityComponent
import io.bratexsoft.traintimetable.di.module.StationListModule
import javax.inject.Inject

class StationListActivity : BaseActivity<ActivityStationListBinding, StationListContract.View, StationListPresenter>(), StationListContract.View {

    @Inject
    lateinit var adapter: StationListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.recyclerViewStations.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewStations.adapter = adapter
        binding.recyclerViewStations.setHasFixedSize(true)
    }

    override fun attachViewToPresenter(presenter: StationListPresenter) {
        presenter.onTakeView(this)
    }

    override fun attachPresenterToDataBinding(presenter: StationListPresenter, binding: ActivityStationListBinding) {
    }

    override fun showError() {
    }

    override fun onDataLoaded() {
        adapter.notifyDataSetChanged()
    }

    override fun onDataError(message: String) {
    }

    override fun returnToMainView() {
    }

    override fun getLayoutRest(): Int {
        return R.layout.activity_station_list
    }

    override fun performFieldInjection(activityComponent: ActivityComponent) {
        activityComponent.plusStationListModule(StationListModule()).injectStationListActivity(this)
    }

}