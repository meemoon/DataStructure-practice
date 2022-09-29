fun main() {
    var c1 = Cat()
    var c2 = Cat(name = "하늘")
    var c3 = Cat(5, "나비")
    println("-------------------------")

    c2?.run { // 소속된 객체는 this로 지칭
        helloToOther(c1)
        helloToOther(c2)
        helloToOther(c3)
    }
}