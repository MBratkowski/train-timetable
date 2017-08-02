package io.bratexsoft.presentation.contract

import io.bratexsoft.presentation.base.BaseView
import io.bratexsoft.presentation.view.CollectionView
import io.bratexsoft.presentation.viewmodel.StationItem

interface StationListContract {
    interface Presenter : CollectionContract<StationItem>

    interface View : CollectionView, BaseView {
        fun returnToMainView()
    }
}