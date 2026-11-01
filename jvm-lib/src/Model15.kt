package c

class Model15(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel15(): Int = Model15(15).twice()
