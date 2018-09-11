package com.chedi.mvvmcomplete.base

import android.arch.lifecycle.ViewModel
import com.chedi.mvvmcomplete.module.injection.NetworkModule
import com.chedi.mvvmcomplete.module.injection.component.DaggerViewModelInjector
import com.chedi.mvvmcomplete.module.injection.component.ViewModelInjector
import com.chedi.mvvmcomplete.ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}