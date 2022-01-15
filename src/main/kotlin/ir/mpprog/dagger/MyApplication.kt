package ir.mpprog.dagger

class MyApplication {

    lateinit var repository: Repository

    fun runApp(){
        repository = Repository()
        println(repository.getUsersName())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyApplication().runApp()
        }
    }
}