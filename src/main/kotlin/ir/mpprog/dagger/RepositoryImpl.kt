package ir.mpprog.dagger

import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val  capitalizer: Capitalizer
) : IRepository {

    override fun getUsersName(): List<String> {
        return listOf("mamad", "gholi").map { capitalizer.capitalize(it) }
    }

}