fun main() {
    var c1 = Cat()
    var c2 = Cat(name="νλ")
    var c3 = Cat(5,"λλΉ")
    println("-------------------------")

    c2?.apply {
        this.age = 10
        this.helloToOther(c1)
        this.helloToOther(null)
        this.helloToOther(c3)
    }?.talk()

}