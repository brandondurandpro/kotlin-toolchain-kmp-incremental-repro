package a

class Model8(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel8(): Int = Model8(8).twice()
