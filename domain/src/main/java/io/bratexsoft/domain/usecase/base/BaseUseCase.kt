package io.bratexsoft.domain.usecase.base

abstract class BaseUseCase<T, V>(protected val callbackData: CallbackData<V>) : UseCase<T>