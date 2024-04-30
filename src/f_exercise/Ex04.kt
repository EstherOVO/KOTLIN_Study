package f_exercise

/*
연습 문제 4 : 맵의 활용

Map을 생성하고 특정 작업을 수행하여 결과를 출력하세요.

요구사항 :
- 문자열을 Key로 하고 정수를 Value로 하는 맵 ages를 생성하고, 초기값으로 {"Tom" : 30, "Jane" : 25}를 할당하세요.
- 맵에 "Sam"의 나이 28을 추가하세요.
- "Jane"의 나이를 26으로 업데이트하세요.
- 모든 엔트리를 출력하세요.
*/

fun main() {

    val ages = mutableMapOf("Tom" to 30, "Jane" to 25)
    println("초기 맵 : ${ages}")

    ages.put("Sam", 28) // ages["Sam"] = 28
    ages.replace("Jane", 26)    // ages["Jane"] = 26
    println("수정 후 맵 : ${ages}")
}