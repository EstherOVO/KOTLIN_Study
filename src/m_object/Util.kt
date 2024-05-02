package m_object

// 기본 생성자의 접근 제한을 private으로 하고 싶을 경우 constructor 키워드를 명시해야 한다.
// 예를 들어 자바에서는 생성자에 private MathUtilJava() {} ← 이렇게 표시하는 걸
// 코틀린에서는 아래와 같이 표시한다.
class MathUtil private constructor() {

//  companion object 내부 메서드는 자바의 static 메서드처럼 사용한다.
    companion object {

        fun add(a: Int, b: Int): Int = a + b
    }
}

fun main() {

    println(MathUtil.add(1, 2))
}