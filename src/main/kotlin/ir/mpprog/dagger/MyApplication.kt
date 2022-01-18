package ir.mpprog.dagger

import ir.mpprog.dagger.module.OsInfoModule
import ir.mpprog.dagger.util.OsInfo
import javax.inject.Inject

class MyApplication {

    @Inject
    lateinit var iRepository: IRepository

    @Inject
    lateinit var osInfo: OsInfo

    fun runApp(){
        //repository = Repository()
        DaggerAppComponent.builder()
            .osInfoModule(OsInfoModule(System.getProperties()))
            .build()
            .inject(this)

        println(iRepository.getUsersName())

        println("osInfo: $osInfo")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyApplication().runApp()
        }
    }
}