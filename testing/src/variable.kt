const val APP: String = "Aplikasi Ngawir"
const val VERSION = "0.0.2"


fun main() {
    val firstname: String = "Ikmal Akbar"
    val age:Int = 20

    println("Your name is: $firstname and your age is $age")

    val name: String? = null
    println(name)
    println(name?.length)

    println("Your app name is: $APP and it is on version: $VERSION")
}