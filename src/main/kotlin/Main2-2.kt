fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // Error. Outer클래스의 객체는 생성한 후에 사용 가능.
    val outer = Outer()
    println(outer.outside())

    Outer.Nested().accessCompanionMethod()
}