class RingBuffer<Element> (val sizeL Int) {
    private  var elements = arrayOfNulls<Any>(size)
    private  var read_point = 0
    private var write_point = 0
    var count: Int = 0
        private set

    fun first(): Element? {
        if (count > 0)
            return //여기 채우기
        return null
    }

    fun write(element: Element): Boolean {
        if //여기 채우기
            return false
        elements.set(//여기 채우기)
        count += 1
        write_point = if (/*여기 채우기*/) 0 else write_point + 1
        return true
    }

    fun read(): Element? {
        if (count <= 0)
            return null
        // 여기 채우기
        return ret
    }

    override fun toString(): String {
        var ret = "["
        var tmp_read_point = read_point
        var tmp_count = count
        while (/*여기 채우기*/) {
            ret += "//여기 채우기"
            tmp_read_point += 1
            if (/*여기 채우기*/)
                tmp_read_point = 0
            tmp_count -= 1
        }
        ret += "]"
        return ret
    }
}


