package a

class Model13(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel13(): Int = Model13(13).twice()
