fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-------------------------")

    c2?.also { //it 으로 주어진 객체 c2 가리킴
        it.age = 10
        it.helloToOther(c1)
        it.helloToOther(null)
        it.helloToOther(c3)
    }?.talk() // also 실행후 뒤에것도 실행하라 할때 사용

}