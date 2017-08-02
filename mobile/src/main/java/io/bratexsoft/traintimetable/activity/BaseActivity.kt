package io.bratexsoft.traintimetable.activity

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import io.bratexsoft.presentation.base.BasePresenter
import io.bratexsoft.presentation.base.BaseView
import io.bratexsoft.traintimetable.app.TrainTimetableInjector
import io.bratexsoft.traintimetable.di.component.ActivityComponent
import io.bratexsoft.traintimetable.di.component.AppComponent
import io.bratexsoft.traintimetable.di.component.DaggerActivityComponent
import io.bratexsoft.traintimetable.di.module.ActivityModule
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, V : BaseView, P : BasePresenter<V>> : AppCompatActivity() {

    @Inject
    lateinit var presenter: P

    lateinit var binding: B

    val activityComponent: ActivityComponent by lazy {
        DaggerActivityComponent.builder().
                appComponent(getAppComponent())
                .activityModule(ActivityModule(this))
                .build()
    }

    @LayoutRes
    abstract fun getLayoutRest(): Int

    abstract fun performFieldInjection(activityComponent: ActivityComponent)

    abstract fun attachViewToPresenter(presenter: P)

    abstract fun attachPresenterToDataBinding(presenter: P, binding: B)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performFieldInjection(activityComponent)
        binding = DataBindingUtil.setContentView<B>(this, getLayoutRest())
        attachPresenterToDataBinding(presenter, binding)
        attachViewToPresenter(presenter)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDropView()
    }

    fun getAppComponent(): AppComponent = TrainTimetableInjector.INSTANCE.appComponent
}