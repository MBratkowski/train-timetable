package io.bratexsoft.data

class BaseRequestManager<ResultType, RequestType> : RequestManager<ResultType, RequestType> {




    override fun saveCallResultToDb(item: ResultType) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun shouldFetch(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadFromDb(): ResultType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createCall(item: RequestType): ResultType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFetchFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}