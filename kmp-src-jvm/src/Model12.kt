package a

class Model12(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel12(): Int = Model12(12).twice()
