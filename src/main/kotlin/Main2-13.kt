fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-------------------------")

    c2?.apply {
        this.age = 10
        this.helloToOther(c1)
        this.helloToOther(null)
        this.helloToOther(c3)
    }?.talk()

}