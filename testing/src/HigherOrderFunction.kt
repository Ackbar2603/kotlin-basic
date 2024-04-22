fun hello(name: String, transformer: (String) -> String):String {
    val nameTransform = transformer(name)
    return "hello $nameTransform"
}

fun main() {
    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Eko", lambdaUpper))

    val result = hello("EKO") {value: String
        -> value.toLowerCase()}
    println(result)
}