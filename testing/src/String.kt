fun main() {
    var FirstName: String = "Ikmal"
    var LastName: String = "Akbar"
    var FullName: String = "$FirstName $LastName"
    var desc: String = "$FullName length = ${FullName.length}"


    var Address: String = """
        *Alamat* 
        > RT/RW: 002/004
        >Kecamatan: Nongsa
        >Kelurahan: Batu Besar
        >Desa     : Kampung Jabi
    """.trimMargin(">")

    println("Hello: $FullName")
    println("$desc")
    println(Address)
}