package a

class Model18(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel18(): Int = Model18(18).twice()
