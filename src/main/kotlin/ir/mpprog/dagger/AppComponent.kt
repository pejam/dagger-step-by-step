package ir.mpprog.dagger

import dagger.Component
import ir.mpprog.dagger.module.AppModule
import ir.mpprog.dagger.module.DataModule
import ir.mpprog.dagger.module.OsInfoModule

@Component(modules = [
    AppModule::class,
    DataModule::class,
    OsInfoModule::class
])
interface AppComponent {
    fun inject(app: MyApplication)
}