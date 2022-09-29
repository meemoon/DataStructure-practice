class Flower private constructor(val name: String){  //singleton으로 만들어 주기 위해 private
    companion object bud {
        private  var numFlowers: Int = 0
        fun bloom(name: String): Flower? {
            if (numFlowers > 0)
                return null
            numFlowers += 1
            return Flower(name)
        }
    }

    override fun toString(): String {
        return "Flower $name"
    }
}

class Outer {
    var ov = 5
    class Nested { // Nested class -> 클래스안에 클래스임
        val nv = 10
        fun greeting() = "Nested"
        fun accessCompanionMethod() {
            println(country)
            getSomething() // 그냥 호출!
        }
    }
    companion object {
        const val  country = "Korea"
        fun getSomething() = println("Get Country")
        //객체 생성하여 호출!
        fun call_nested_greeting() { Outer.Nested().greeting() }
    // Nested 객체가 생성되진 않았지만 같이 Outer class에 소속(companion)되어있어 호출 가능
    // Nested() 객체 생성
    }
    fun outside() {
        val msg = Nested().greeting()
        println(Nested().nv)
    }
}

class Smartphone (val model : String) {
    private val cpu = "i5-8900"
    var name: String = "Noname"
    fun func1() {
        println("name is $name")
    }

    inner class Inner {
        fun which_cpu() {
            println(cpu)
            getSomething()
        }
    }
    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get Country")
        fun which_cpu() {
            //println(cpu) //에러. Outer 접근 불가
            // func1() // 에러. Outer 접근 불가
            println("I don't know..")
        }
    }
}

// sealed 클래스 활용하는 첫번째 방법 (nested class 활용)
sealed class Fruit1 {
    class Apple():Fruit1() // 상속받는 class를 모아 표기
    class Banana():Fruit1()
}
// sealed 클래스 활용하는 두번째 방법
sealed class Fruit2
class Apple():Fruit2()
class Banana():Fruit2()

// 상수들의 모음_ 밀접한 상수들을 모아서 관리 (각각 const val 안쓰고)
enum class WeekDay{
    Sunday, Monday, Tuesday, Wednessday, Thurseday, Friday, Saturday
}

enum class WeekDay2(val favor:Int){
    Sunday(80), Monday(0),
    Tuesday(10), Wednessday(20),
    Turseday(30), Friday(90),
    Saturday(100);

    fun showFavor() {
        println("I love ${this.name} ${this.favor}%")
    }
}

open class Animal (var age: Int)
// 여러 버전의 생성자 만듦
// this 키워드로 서로 호출 가능
class Cat(age: Int = 1, var name: String): Animal (age) {
    constructor(age: Int) : this(age, "Noname") {
        println("이름없는 고양이 생성됨.")
    }

    constructor() : this(name = "Noname") {
        println("이름없는 고양이가 기본 나이로 생성됨.")
    }

    fun talk() {
        print("${name}: ")
        for (i in 1..age) { // for (i in 1..age}
            print("야옹")
        }
        println()
    }
    fun helloToOther(c: Cat?) { // Cat에 null값 들어갈 수 있음
        print("${name}: ")
        val isOlder = c?.let {
            it.age > this.age
        // let 구역 안에 it(c 객체 자체를 지칭)의 나이가 this(나 자신_객체 자체)나이보다 크니?
        }
        when(isOlder) {
            false -> println("(${c.name}에게)안녕.")
            true -> println("${c.name}에게)안녕하세요.")
            else -> println("...")
        }
    }
}
