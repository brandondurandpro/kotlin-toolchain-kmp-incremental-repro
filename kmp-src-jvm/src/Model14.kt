package a

class Model14(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel14(): Int = Model14(14).twice()
