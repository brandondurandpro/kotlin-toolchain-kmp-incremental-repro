package a

class Model25(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel25(): Int = Model25(25).twice()
