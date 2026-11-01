package c

class Model27(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel27(): Int = Model27(27).twice()
