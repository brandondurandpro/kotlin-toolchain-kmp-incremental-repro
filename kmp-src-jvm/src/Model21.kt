package a

class Model21(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel21(): Int = Model21(21).twice()
