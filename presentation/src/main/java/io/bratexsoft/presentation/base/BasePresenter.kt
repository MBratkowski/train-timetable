package io.bratexsoft.presentation.base

open class BasePresenter<ViewType : BaseView> {

    var view: ViewType? = null

    fun onTakeView(view: ViewType) {
        this.view = view
        onTakenView(view)
    }

    fun onDropView() {
        this.view = null
    }

    open fun onTakenView(view: ViewType) {
        //To implements by children
    }
}