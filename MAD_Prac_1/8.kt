fun main() {
    println("Array-1 -> by using arrayOf() method")
    val a1 = arrayOf(26, 85, 96, 16, 43)
    println(a1.contentToString())

    println("Array-2 -> by using Array<>()")
    val a2 = Array(5) { 0 }
    println(a2.contentToString())

    println("Array-3 -> by using Array<>() and lambda function")
    val a3 = Array(7) { i -> i }
    println(a3.contentToString())

    println("Array-4 -> by using IntArray()")
    val a4 = IntArray(5)
    println(a4.joinToString(", "))

    println("Array-5 by using intArrayOf() : ")
    val a5 = intArrayOf(15, 43, 96, 67, 35, 71, 28, 19)
    println(a5.joinToString(", "))

    println("2-D Array -> by using arrayOf() and intArrayOf()")
    val a6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println(a6.contentToString())

    print("Enter number of Elements: ")
    val size: Int = readLine()!!.toInt()
    val user = IntArray(size) { 0 }
    for (i in 0 until size) {
        print("Enter the Element: ")
        user[i] = readLine()!!.toInt()
    }

    println("Entered Array = ")
    println(user.contentToString())

    println("========================== With In-Built Function ==========================")
    println("Array Sorted by in-built Function = ")
    user.sort()
    println(user.contentToString())

    val a7 = intArrayOf(45, 96, 689, 593, -45, -76, -453, -56)
    println("========================== Without In-Built Function ==========================")
    println("Array Sorted without in-built Function = ")
    println(a7.contentToString())

    // Sorting without using the in-built function
    var temp: Int
    for (i in a7.indices) {
        for (j in i + 1 until a7.size) {
            if (a7[j] < a7[i]) {
                temp = a7[j]
                a7[j] = a7[i]
                a7[i] = temp
            }
        }
    }

    println("Array Sorted without in-built Function = ")
    println(a7.contentToString())
}