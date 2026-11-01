package b

class Model9(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel9(): Int = Model9(9).twice()
