package ir.mpprog.dagger

import java.util.*

class Capitalizer {

    fun capitalize(name: String): String{
        return name.replaceFirstChar { if(it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}