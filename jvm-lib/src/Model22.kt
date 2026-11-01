package c

class Model22(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel22(): Int = Model22(22).twice()
