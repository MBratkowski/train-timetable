package io.bratexsoft.presentation.contract

import io.bratexsoft.presentation.ViewType

interface CollectionContract<T> {
    fun getCollectionSize(): Int

    fun getItem(position: Int): T

    fun bindResult(result: List<ViewType>)

    fun bindError(message: String)
}