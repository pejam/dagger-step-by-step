package ir.mpprog.dagger

import javax.inject.Inject

class Repository @Inject constructor() {

    fun getUsersName(): List<String> {
        return listOf("mamad", "gholi")
    }

}