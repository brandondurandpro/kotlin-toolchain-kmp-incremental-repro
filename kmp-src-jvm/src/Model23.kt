package a

class Model23(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel23(): Int = Model23(23).twice()
