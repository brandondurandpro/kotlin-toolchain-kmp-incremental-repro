package c

class Model7(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel7(): Int = Model7(7).twice()
