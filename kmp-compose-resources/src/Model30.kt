package b

class Model30(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel30(): Int = Model30(30).twice()
