package io.bratexsoft.traintimetable.activity

import io.bratexsoft.presentation.contract.MainContract
import io.bratexsoft.presentation.presenter.MainPresenter
import io.bratexsoft.traintimetable.R
import io.bratexsoft.traintimetable.databinding.ActivityMainBinding
import io.bratexsoft.traintimetable.di.component.ActivityComponent
import io.bratexsoft.traintimetable.di.module.MainModule
import io.bratexsoft.traintimetable.utils.launchActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainContract.View, MainPresenter>(), MainContract.View {

    override fun attachPresenterToDataBinding(presenter: MainPresenter, binding: ActivityMainBinding) {
        binding.presenter = presenter
    }

    override fun attachViewToPresenter(presenter: MainPresenter) {
        presenter.onTakeView(this)
    }

    override fun performFieldInjection(activityComponent: ActivityComponent) {
        activityComponent.plusMainModule(MainModule()).injectMainActivity(this)
    }

    override fun getLayoutRest(): Int {
        return R.layout.activity_main
    }

    override fun startFromActivity() {
        launchActivity<StationListActivity>()
    }

    override fun startToActivity() {
        launchActivity<StationListActivity>()
    }

    override fun showError() {
    }
}
