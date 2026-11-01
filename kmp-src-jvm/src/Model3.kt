package a

class Model3(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel3(): Int = Model3(3).twice()
