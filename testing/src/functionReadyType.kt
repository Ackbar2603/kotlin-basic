fun perjumlahan(a: Int, b: Int):Int {
    val total = a + b
    return total
}

fun pembagian(a: Int, b:Int):Int {
    if (b == 0) {
        return 0
    }else {
        val total = a / b
        return total
    }
}

fun main() {
    println(perjumlahan(10, 15))
    println(perjumlahan(20, 30))

    val hasil = perjumlahan(100, 20)
    println("hasil jumlah adalah $hasil")


    val hasilBagi = pembagian(10, 5)
    println("hasil bagi adalah $hasilBagi")
    println(pembagian(10, 0))
}