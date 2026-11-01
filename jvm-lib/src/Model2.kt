package c

class Model2(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel2(): Int = Model2(2).twice()
