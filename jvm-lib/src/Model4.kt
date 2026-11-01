package c

class Model4(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel4(): Int = Model4(4).twice()
