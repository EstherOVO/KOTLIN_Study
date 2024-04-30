package i_function

// Vararg : 가변인자("VAR"iable - "ARG"ument)
// 같은 타입의 매개변수를 한 번에 받기
// 매개변수 앞에 vararg 키워드 사용

// fun printNumber(number1: Int, number2: Int, number3: Int) {} →
fun printNumber(vararg numbers: Int) {

//  같은 배열로 인자를 받음
    for (number in numbers) {
        print("${number} ")
    }
    println()
}

// 가변인자는 매개변수 어디에나 올 수 있지만, 가변인자 뒤에 다른 매개변수가 있으면
// 반드시 이름을 지정하여 호출해야 한다.
fun printNumbersWithSuffix(vararg numbers: Int, suffix: String) {

//  같은 배열로 인자를 받음
    for (number in numbers) {
        print("${number}${suffix} ")
    }
    println()
}

fun main() {

//  인자로 0개 이상의 값을 입력 받을 수 있다.
    printNumber(5)
    printNumber(5, 1, 2, 3)
    printNumber(1, 4, 65, 4, 23, 3, 4, 2, 12, 100)

    printNumbersWithSuffix(1, 2, 3, suffix = "개")
    printNumbersWithSuffix(4, 5, 6, suffix = "자루")

//  가변 인자를 배열로 전달
    val ints = intArrayOf(7, 8, 9)
    printNumber(*ints)
//  배열을 직접 넣는 것이 아니라, 스프레드 연산자(*)를 인자 앞에 표시하여 배열 값을 전달
    printNumbersWithSuffix(*ints, suffix = "통")
}
