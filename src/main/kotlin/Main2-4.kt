fun main() {
    // 너가 존재해야 내가 존재한다.
    var i1 = Smartphone("A32")
    // var i2 = Smartphone.Inner() // 에러.
    var i2 = i1.Inner()

    //남남에 가까운 컨셉.
    var o1 = Outer()
    var o2 = Outer.Nested()

    // 난 너가 존재하지 않더라도, 너만을 바라볼꺼야.
    var c1 = Smartphone("S7")
    var c2 = Smartphone.Companion
        // var c3 = c1.Companion // 에러.
}