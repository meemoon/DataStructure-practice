fun main() {
    val queue = ArrayListQueue<String>().apply {
        enqueue("1")
        enqueue("21")
        enqueue("18")
        enqueue("42")
    }
    println("before: $queue")
    queue.reverse()
    println("after: $queue")
}