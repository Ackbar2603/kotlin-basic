fun main() {

    var total = 0;
    val names = arrayOf("Andi","Ikmal","Husain","Ifgan","Sekar")
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan adalah = $total")

    //For Range

    var hasil = 0;
    for (value in 0..50) {
        hasil++
        println(value)
    }
    println("Total perulangan adalah = $hasil")


    for (value in 1000 downTo 0 step 5) {
        println(value)
    }
}