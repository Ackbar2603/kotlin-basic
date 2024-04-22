fun printHello(name: String? = null): Unit {
    if (name == null) {
        println("Hello Guess")
    } else {
        println("Hello $name")
    }

}

fun main() {
    printHello()
}