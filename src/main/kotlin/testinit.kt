class tudent(enroll:Int=131,name:String="Umang")
{
    var en:Int
    var n:String
    init {
        en=enroll
        n=name
        println("Enrollment : $en")
        println("name:$n")
    }
}
fun main()
{
    var c= tudent()
    var a = tudent(164,"nisarg")
    var b = tudent(125,"Yash")
}