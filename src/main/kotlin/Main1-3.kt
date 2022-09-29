fun main(){
    val list = LinkedList<Int>()
    list.append(10).append(30).append(20)
    println(list)

    println(list.nodeAt(2))
    println(list.nodeAt(3))
}