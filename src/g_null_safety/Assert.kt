package g_null_safety

// null 단언 연산자(!!)
// 개발자가 해당 변수의 값이 null이 아니라고 강제로 단언

fun main() {

    val name: String? = "홍길동"
    println("문자열의 길이 : ${name!!.length}")

//  그럼에도 불구하고 null이 대입되는 경우 NullPointerException 발생

//  사용자의 입력을 받는 경우 readLine()
    print("문자열을 입력하세요 : ")
    val input: String? = readLine()

//  null 검증
    if (input != null) {
        processInput(input)
    } else {
        println("유효한 입력이 아닙니다.")
    }
}

fun processInput(input: String?) {

    val validInput = input!!    // null 검증이 끝났음을 개발자가 단언
    println(validInput.length)
}
