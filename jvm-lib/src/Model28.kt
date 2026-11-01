package c

class Model28(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel28(): Int = Model28(28).twice()
