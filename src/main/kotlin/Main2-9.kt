fun main() {
    var c1 = Cat()
    var c2 = Cat(name="νλ")
    var c3 = Cat(5,"λλΉ")
    println("-------------------------")

    c1.helloToOther(c3)
    c3.helloToOther(c2)
}