fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-------------------------")

    c1.helloToOther(c3)
    c3.helloToOther(c2)
}