package io.bratexsoft.domain.usecase.base

interface CallbackData<T> {
    fun onSuccess(data: T)

    fun onError(message : String)
}