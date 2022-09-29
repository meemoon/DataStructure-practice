class LinkedListIterator<K> (
    private val list: LinkedList<K>
) : Iterator<K> {
    private  var index = 0
    private  var lastNode: Node<K>? = null

    override fun next(): K {
        if (index >= list.size) throw IndexOutOfBoundsException()
        lastNode = if (index == 0) {
            list.nodeAt(0)
        }else
            lastNode?.next
        index++
        return lastNode!!.value
    }
    override fun hasNext(): Boolean {
        return index < list.size
    }
}