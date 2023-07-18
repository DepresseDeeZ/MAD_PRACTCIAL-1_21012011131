fun add(a:Int , b:Int , c:Int):Int{
    val sum:Int=a+b+c
    println("sum of $a , $b , $c is :$sum")
    return sum
}
fun sub(a:Int , b:Int , c:Int):Int{
    val sub:Int=a-b-c
    println("Subtraction of $a , $b , $c is :$sub")
    return sub
}
fun mult(a:Int , b:Int , c:Int):Int{
    val mult:Int=a*b*c
    println("Multiplication of $a , $b , $c is :$mult")
    return mult
}
fun div(a:Int , b:Int ):Float{
    val div=a/b.toFloat()
    println("Division of $a , $b is :$div")
    return div
}

fun main(){
    println("Enter 3 Numbers: ")
    val a= readLine()?.toInt()!!
    val b= readLine()?.toInt()!!
    val c= readLine()?.toInt()!!

    add(a,b,c)
    sub(a,b,c)
    mult(a,b,c)
    div(a,b)
}