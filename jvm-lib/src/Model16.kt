package c

class Model16(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel16(): Int = Model16(16).twice()
