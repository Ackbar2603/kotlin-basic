fun main() {

    val names:Array<String> = arrayOf("Ikmal", "William", "Mike")

    names.set(0, "Mark")
    println(names.run { get(0) })

    val numbers:Array<Int> = arrayOf(10, 20, 30, 43, 12, 29)

    numbers.set(3, 19)
    println(numbers.run { get(3) })

    val nomor: Array<String?> = arrayOfNulls(5)
    nomor[0] = "Ikmal"
    nomor[1] = "Ikmal"
    nomor[2] = "Ikmal"
    nomor[3] = "Ikmal"
    nomor[4] = "Ikmal"
    println(nomor.run { get(0) })
}