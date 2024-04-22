fun sayHello(firstname: String, lastname: String?) {
    if (lastname == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastname")
    }

}

fun main() {
    sayHello("Kemal", null)
    sayHello("Kemal", "Ackbar")
}