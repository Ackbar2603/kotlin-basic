fun toUpper(value: String): String = value.toLowerCase()

fun main() {
    val contohLambda: (String, String) -> String = {firstName:String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }

    val result = (contohLambda("Ikmal", "Akbar"))
    println(result)

    val lambdaName:(String) ->String = {
        "hello $it"
    }
    println(lambdaName("Ikmal Akbar"))

    val lambda: (String) -> String = ::toUpper

    val name = lambda("Ikmal")
    println(name)
}