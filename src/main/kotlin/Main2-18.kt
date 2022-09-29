fun main() {
    val list = LinkedList<Int>()
    var popedValue = list.pop()
    println(popedValue)

    list.append(10).append(30).append(20)

    println("Before popping list: $list")
    popedValue = list.pop()
    println("After popping list: $list")
    println("Popped value: $popedValue")
}