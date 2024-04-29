package f_exercise

/*
연습 문제 3 : 리스트 조작

리스트를 생성하고, 이 리스트에 여러 작업을 수행하여 결과를 출력하세요.

요구사항 :
- 정수 리스트 numbers를 생성하고 초기값으로 [1, 2, 3, 4, 5]를 할당하세요.
- 리스트에 숫자 6을 추가하세요.
- 리스트의 두 번째 위치에 숫자 10을 삽입하세요.
- 리스트의 마지막 요소를 제거하고, 결과를 출력하세요.
*/

fun main() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)

    println("초기 리스트 : ${numbers}")

    numbers.add(6)
    numbers.add(1, 10)
    println("수정 후 리스트 : ${numbers}")

    numbers.removeLast()
    println("마지막 요소를 제거한 리스트 : ${numbers}")
}