fun main() {
    fun sayHelloIf(name: String): String{
        return if (name == "") {
            "Hello User!"
        } else{
            "Hello $name"
        }
    }

    println(sayHelloIf(""))
    println(sayHelloIf("Ikmal Akbar"))

    fun sayHelloWhen(nama: String): String{
        return when(nama){
         "" -> "Hello User"
            else -> "Hello $nama"

        }
    }
    println(sayHelloWhen(""))
    println(sayHelloWhen("Kemal Ackbar"))

}