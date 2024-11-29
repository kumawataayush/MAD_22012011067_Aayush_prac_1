fun main()
{ print("Enter Elements : ")
    val n:Int = readLine()!!.toInt()
    val num = ArrayList<Int>()
    var maxnum = 0
    for (i:Int in 0 until n)
    { print("nums[$i] = ")
        num.add(i,readLine()!!.toInt())
        if (maxnum<num[i])
        { maxnum = num[i] } }
    println()
    println("Maximum Element from Array Without in-built Function = $maxnum")
    println("Maximum Element from Array With in-built Function = ${num.max()}") }