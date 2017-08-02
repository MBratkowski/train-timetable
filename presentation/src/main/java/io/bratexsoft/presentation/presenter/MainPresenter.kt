package io.bratexsoft.presentation.presenter

import io.bratexsoft.presentation.base.BasePresenter
import io.bratexsoft.presentation.contract.MainContract

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {

    override fun openFromView() {
        view?.startFromActivity()
    }

    override fun openToView() {
        view?.startToActivity()
    }

}