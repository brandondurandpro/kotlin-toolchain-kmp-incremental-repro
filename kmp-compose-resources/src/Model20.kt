package b

class Model20(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel20(): Int = Model20(20).twice()
