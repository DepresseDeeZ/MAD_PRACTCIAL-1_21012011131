import java.util.Scanner
fun main()
{
    val sc = Scanner(System.`in`)
    println("enter a number")
    val r = sc.nextInt()
    if(r%2==0)
    {
        println("$r is Even no")
    }
    else
    {
        println("$r is odd no")
    }
}