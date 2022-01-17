package ir.mpprog.dagger

import java.util.*
import javax.inject.Inject

class Capitalizer @Inject  constructor() {

    fun capitalize(name: String): String{
        return name.replaceFirstChar { if(it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}