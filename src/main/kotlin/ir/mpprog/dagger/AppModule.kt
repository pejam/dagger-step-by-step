package ir.mpprog.dagger

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideCapitalizer(): Capitalizer{
        return Capitalizer()
    }
}