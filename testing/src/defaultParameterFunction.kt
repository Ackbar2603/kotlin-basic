fun hello(firstname: String, middlename: String? = null, lastname: String) {
    if (middlename == null) {
        println("Hello $firstname $lastname")
    } else {
        println("Hello $firstname $middlename $lastname")
    }
}

fun simpleHello(namaAwal: String, namAkhir: String? = null) {
    if (namAkhir == null) {
        println("Hello $namaAwal")
    } else {
        println("Hello $namaAwal $namAkhir")
    }

}

fun main() {
    simpleHello("Ikmal")
    simpleHello("Sekar","Ayuri")
}