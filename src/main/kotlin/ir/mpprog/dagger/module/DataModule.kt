package ir.mpprog.dagger.module

import dagger.Binds
import dagger.Module
import ir.mpprog.dagger.IRepository
import ir.mpprog.dagger.RepositoryImpl


@Module
interface DataModule {
    @Binds
    fun bindRepository(impl: RepositoryImpl) : IRepository

}

