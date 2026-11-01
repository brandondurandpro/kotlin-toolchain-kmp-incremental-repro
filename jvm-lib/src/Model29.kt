package c

class Model29(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel29(): Int = Model29(29).twice()
