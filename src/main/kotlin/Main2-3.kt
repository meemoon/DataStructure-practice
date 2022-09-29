fun main() {
    // Inner 클래스 (Outer class에게 무제한 접근 가능)
    var s1 = Smartphone("A32") // 객체 만듦
    s1.Inner().which_cpu() // 객체에서 접근 가능
    //Smartphone.Inner().which_cpu() // 에러. 클래스에서 접근 불가능

    //Companion object
    // (Outer class에게 접근 불가능)
    // (단, 예외적으로 Outer의 'private 생성자'는 접근 가능)
    Smartphone.Companion.which_cpu()
        // Companion object는 클래스에서 접근 가능
    // s1.Companion.which_cpu() // 에러. 객체에서 접근 불가능

    // Nested 클래스 (Outer class에게 접근 불가능)
    val outer = Outer()
    Outer.Nested().accessCompanionMethod() // 클래스에서 접근 가능
    // outer.Nested().accessCompanionMethod() // 에러. 객체에서 접근 불가능
}