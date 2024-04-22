fun toUpperCase(value: String): String = value.toUpperCase()

fun main() {
    //Recursivefunction
    fun Factorialloops (value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *= i
        }
        return result

    }
    println(Factorialloops(10))

    fun Factorialrecursive (value: Int): Int{
        return when (value){
            1 -> 1
            else -> value * Factorialloops(value - 1)
        }
    }
    println(Factorialrecursive(10))

    //Lambda
    val contohLambda: (String, String) -> String = {firstname: String, lastName: String ->
        val result = "$firstname $lastName"
        result
    }

    val result = contohLambda("Ikmal","Akbar")
    println(result)

    val lambdaName: (value: String) ->String = {
        "Hello $it"
    }
    println(lambdaName("Dika"))

    val toUpCase: (value: String) ->String = ::toUpperCase

    val name = toUpCase("Imal")
    println(name)

    val Nilaiujian = 80

    if (Nilaiujian > 100){
        println("Perfect")
    } else if (Nilaiujian > 80){
        println("not bad")
    }
}