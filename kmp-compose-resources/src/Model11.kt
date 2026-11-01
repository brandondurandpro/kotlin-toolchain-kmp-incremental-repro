package b

class Model11(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel11(): Int = Model11(11).twice()
