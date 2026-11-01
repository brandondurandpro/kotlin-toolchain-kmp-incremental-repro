package a

class Model19(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel19(): Int = Model19(19).twice()
