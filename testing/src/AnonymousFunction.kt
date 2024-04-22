fun main() {
    fun hello(name: String, transformer: (String) -> String):String {
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }

    val lower = fun(value: String): String{
        if (value == "") {
            return "TAMU"
        }else{
            return value.toLowerCase()
        }
    }

    println(hello("IKMAL", lower))
    println(hello("", lower))

    println(hello("KEMAL", fun(value: String): String{
        return value.toLowerCase()
    }))

    println(hello("akbar", fun(value:String): String{
        return value.toUpperCase()
    }))

}