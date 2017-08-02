package io.bratexsoft.presentation.view

interface CollectionView {
    fun onDataLoaded()

    fun onDataError(message: String)
}