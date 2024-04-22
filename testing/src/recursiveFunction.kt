fun main() {
   fun factorialLoops(value: Int):Int{
       var result = 1
       for (i in value downTo 1){
           result *= 1
       }
       return result
   }
    println(factorialLoops(10))

   fun factorialRecursive(value: Int):Int{
        return when (value){
            1 ->1
                else -> value * factorialRecursive(value-1)
        }
   }
    println(factorialRecursive(10))

}