package a

class Model5(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel5(): Int = Model5(5).twice()
