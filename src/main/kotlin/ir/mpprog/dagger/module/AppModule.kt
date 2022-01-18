package ir.mpprog.dagger.module

import dagger.Module
import dagger.Provides
import ir.mpprog.dagger.Capitalizer

@Module
class AppModule {

    @Provides
    fun provideCapitalizer(): Capitalizer {
        return Capitalizer()
    }
}