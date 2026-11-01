package a

class Model6(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel6(): Int = Model6(6).twice()
