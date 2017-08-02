package io.bratexsoft.data

import io.reactivex.annotations.NonNull

interface RequestManager<ResultType, RequestType> {

    fun saveCallResultToDb(@NonNull item: ResultType)

    fun shouldFetch(): Boolean

    fun loadFromDb(): ResultType

    fun createCall(item: RequestType): ResultType

    fun onFetchFailed()
}