package io.bratexsoft.presentation.base

open class BasePresenter<ViewType : BaseView> {

    lateinit var view: ViewType

    fun onTakeView(view: ViewType) {
        this.view = view
        onTakenView(view)
    }

    fun onDropView() {
        //this.view = null
    }

    open fun onTakenView(view: ViewType) {
        //To implements by children
    }
}