package f_exercise

/*
연습 문제 2 : 변수의 타입 변환

정수 타입의 변수 initialValue가 선언되어 10으로 초기화되어 있습니다.
이 값을 실수 타입으로 변환하여 doubleValue 변수에 저장하고,
"변환된 값은 10.0입니다."라고 출력하는 프로그램을 작성하세요.

요구사항 :
- initialValue를 Int 타입으로 선언하고 10을 할당하세요.
- initialValue의 값을 Double 타입으로 변환하여 doubleValue에 할당하세요.
- 출력은 println()을 사용하여 표준 출력으로 표시합니다.
*/

fun main() {

    val initialValue: Int = 10
    val doubleValue: Double = initialValue.toDouble()

    println("변환된 값은 ${doubleValue}입니다.")
}