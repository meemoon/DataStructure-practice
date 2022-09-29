fun main() {
    val d1 = WeekDay.Monday
    println(d1)
    println(d1.name)
    println(d1.ordinal) // Monday 위치 : 1
    println(d1.javaClass)
    println("-----------------------------------")
    println(WeekDay.Sunday.ordinal) //Sunday 위치 : 0
}