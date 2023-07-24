class Student(var enroll:Int,var name:String)
{
    constructor():this(131,"umang")
    {

    }
    fun print()
    {
        println(enroll)
        println(name)
    }
}
fun main()
{
    var a = Student()
    a.print()
}