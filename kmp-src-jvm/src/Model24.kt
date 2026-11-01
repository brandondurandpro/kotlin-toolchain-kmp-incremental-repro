package a

class Model24(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel24(): Int = Model24(24).twice()
