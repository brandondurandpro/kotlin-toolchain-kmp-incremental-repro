package a

class Model17(val value: Int) {
    fun twice(): Int = value * 2
}

fun useModel17(): Int = Model17(17).twice()
