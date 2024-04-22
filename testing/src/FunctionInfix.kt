infix fun String.to(type: String): String{
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Eko Widodo" to "LO"
    println(result)
}