fun main() {
    val finalExam = "A"
    when (finalExam) {
        "A" -> println("Amazing")
        "B" -> println("Very Good")
        "C" -> println("Good")
        "D" -> println("Bad")
        "E" -> println("Worse")
        "F" -> println("Dead")
        else -> println("Bruhhhh")


    }

    //multiple when expression option

    when (finalExam) {
        "A", "B", "C" -> println("Pass")
        else -> {
            println("Not Pass")
        }
    }

    //When Expression In
    val nilaiLulus:Array<String> = arrayOf("A", "B", "C")
    when(finalExam) {
        in nilaiLulus -> println("Selamat Anda lulus")
        !in nilaiLulus -> println("Anda Gagal COBA LAGIII!!")
    }

    //When Expression is
    val name = "Jackson"
    when (name) {
        is String -> println("Name is string")
        !is String -> println("Name is not string")
    }

    //When tanda variable
    val examValue = 90
    when {
        examValue > 80 -> println("Nice Job")
        examValue > 60 -> println("Belajar lagi")
        else -> println("you are so bad")
    }
}

