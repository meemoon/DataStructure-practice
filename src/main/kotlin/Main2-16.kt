fun main() {
    val queue = RingBufferQueue<String>(2).apply {
        enqueue("Ray")
        enqueue("Brian")
        enqueue("Eric")
    }
    println(queue)
    println(queue.dequeue()) // 0번째 값 지워짐
    println(queue)
    println("Next up: ${queue.peek()}")
}