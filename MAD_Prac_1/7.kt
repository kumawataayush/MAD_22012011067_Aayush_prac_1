fun fact(x:Int):Int
{ if (x >= 1)
    return x * fact(x-1)
else
    return 1}
fun main()
{ print("ENTER NUMBER : ")
    val n : Int = readLine()!!.toInt()
    println("Factorial of $n = " +fact(n)) }