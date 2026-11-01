package a

class Model10(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel10(): Int = Model10(10).twice()
