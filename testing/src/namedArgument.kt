fun fullName(firstname: String, middlename: String, lastname: String) {
    println("Hello $firstname $middlename $lastname")
}

fun main() {
    fullName("Sekar", "Aulia", "Ayuri")
    fullName(
        middlename = "Aulia",
        lastname = "Ayuri",
        firstname = "Sekar"
    )
}