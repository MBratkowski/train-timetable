package io.bratexsoft.presentation.contract

import io.bratexsoft.presentation.base.BaseView

interface MainContract {
    interface Presenter {
        fun openFromView()

        fun openToView()
    }

    interface View : BaseView {
        fun startFromActivity()

        fun startToActivity()
    }
}