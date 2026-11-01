package b

class Model1(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel1(): Int = Model1(1).twice()
// edit 1793570209339606508
