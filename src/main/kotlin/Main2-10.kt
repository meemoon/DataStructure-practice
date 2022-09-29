fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-------------------------")

    with(c2) { // c2를 this(자기자신_객체)이라 생각
        helloToOther(c1)
        helloToOther(c3)
    }
}