fun String.hello(): String = "hello $this"

fun String.helloprint(): Unit = println("Hello $this")

fun main() {
    val name = "Ikmal Akbar"
    println(name.hello())

    name.helloprint()

    "Dede".helloprint()
}