tailrec fun fact(a:Int):Int
{
    if(a==0||a==1)
    {
        return 1
    }

    else
    {
        return a*fact(a-1).toInt()

    }
}
fun main()
{
    println("enter a number")
    val r = readLine()?.toInt()!!
    println("factorial of $r is :")
   val facts = fact(r)
    println("$facts")
}