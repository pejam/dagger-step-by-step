package ir.mpprog.dagger

import javax.inject.Inject

class MyApplication {

    @Inject
    lateinit var iRepository: IRepository

    fun runApp(){
        //repository = Repository()
        DaggerAppComponent.create().inject(this)

        println(iRepository.getUsersName())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyApplication().runApp()
        }
    }
}