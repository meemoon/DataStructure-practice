fun main() {
    // 첫 번째 사용방법에 대한 실행예시
    val fruits = arrayListOf(Fruit1.Apple(), Fruit1.Banana())
    val someFruit = when(fruits[0]){
        is Fruit1.Apple -> "Apple"
        is Fruit1.Banana -> "Banana"
        // else -> "None" // else가 필요없음. (상속받는 클래스 외에는 다른 클래스 값은 존재하지 않기 때문)
    }
    println(someFruit)

    // 두번째 사용방법에 대한 실행예시
    val fruits2 = arrayListOf(Apple(), Banana())
    val someFruit2 = when(fruits2[0]){
        is Apple -> "Apple"
        is Banana -> "Banana"
        // else -> "None" // else가 필요없음.
    }
    println(someFruit2)
}