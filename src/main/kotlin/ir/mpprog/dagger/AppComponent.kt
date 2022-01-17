package ir.mpprog.dagger

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app :MyApplication)
}