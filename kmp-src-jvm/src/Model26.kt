package a

class Model26(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel26(): Int = Model26(26).twice()
