package e_control

// for문
fun main() {

//  Java의 방식
//  for (int i = 1; i <= 10; i++) { ... }

//  코틀린 : 주로 범위 연산자로 변수 값 증가(수학의 등차수열 사용)
    var sum1 = 0

//  마지막 값 포함
    for (i in 1..10) {  // 마지막 값 포함
        sum1 += i
    }
    println("1부터 10까지의 합계 : ${sum1}")

//  until : 1씩 증가, 마지막 불포함
    var sum2 = 0
    for (i in 1 until 10) { // 마지막 값 포함하지 않음
        sum2 += i
    }
    println("1부터 9까지의 합계 : ${sum2}")

//  step : 반복의 간격을 지정하고 싶을 때
    var sum3 = 0
    for (i in 2..10 step 2) {
        sum3 += i
    }
    println("1부터 10까지의 짝수 합계 : ${sum3}")

//  downTo : 1씩 감소
    for (i in 10 downTo 1) {
        print("$i ")
    }

//  향상된 for문 - for-each문 사용 가능
    println()
    val list = listOf(10, 20, 30, 40)
    for (i in list) {
        print("$i ")
    }

//  while문 자바와 동일하게 사용 가능
    println()
    var i = 1
    while (i <= 10) {
        print("$i ")
        i++
    }
}