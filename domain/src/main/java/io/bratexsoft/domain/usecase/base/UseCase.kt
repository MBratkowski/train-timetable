package io.bratexsoft.domain.usecase.base

interface UseCase<T> {
    fun execute(): T
}