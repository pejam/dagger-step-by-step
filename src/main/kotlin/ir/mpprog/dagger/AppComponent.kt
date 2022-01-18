package ir.mpprog.dagger

import dagger.Component
import ir.mpprog.dagger.module.AppModule
import ir.mpprog.dagger.module.DataModule

@Component(modules = [AppModule::class, DataModule::class])
interface AppComponent {
    fun inject(app :MyApplication)
}