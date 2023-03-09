fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int): Any? {

    return Math.abs(a) % 10
}
