package ir.mpprog.dagger

import javax.inject.Inject

class MyApplication {

    @Inject
    lateinit var repository: Repository

    fun runApp(){
        //repository = Repository()
        DaggerAppComponent.create().inject(this)

        println(repository.getUsersName())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyApplication().runApp()
        }
    }
}