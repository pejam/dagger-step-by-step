package ir.mpprog.dagger.module


import dagger.Module
import dagger.Provides
import ir.mpprog.dagger.util.OsInfo
import java.util.*

@Module
class OsInfoModule(private val systemProperties: Properties) {

    @Provides
    fun provideLibrariesPath() = OsInfo(
        name = systemProperties.getProperty("os.name"),
        version = systemProperties.getProperty("os.version"),
        arch = systemProperties.getProperty("os.arch")
    )
}