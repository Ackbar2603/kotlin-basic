fun main() {
    tailrec fun display(value: Int) {
        println ("Recursive $value")
            if (value >0)
                display(value-1)

    }
    println(display(0))

    tailrec fun factorialRecursiveTail(value: Int, total: Int = 1): Int{
        return when(value) {
            1->total
            else -> factorialRecursiveTail(value -1, total*value)
        }
    }
    println(factorialRecursiveTail(10))
}