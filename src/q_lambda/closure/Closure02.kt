package q_lambda.closure

fun counter(): () -> Int {

    var count = 0
    return { count++ }
//  매개변수가 없고 리턴 값이 정수인 람다식을 리턴
//  클로저에 의해서 'count' 라고 하는 람다식 외부의 변수가 캡쳐가 된다.
}

fun main() {

//  counter 함수를 람다 함수(counter 내부에 있는 함수)를 반환하고,
//  내부 함수는 count 변수를 캡쳐
//  counter() 함수가 종료된 이후에도 counter1 람다 함수를 통해 count 변수가 계속해서 증가하는 것을 확인 가능하다.
//  → 생성될 때의 환경을 기억
    val counter1 = counter()
    println(counter1())     // 출력 : 0
    println(counter1())     // 출력 : 1
    println(counter1())     // 출력 : 2

//  counter()가 호출되는 순간을 기억
    val counter2 = counter()
    println(counter2())     // 출력 : 0
    println(counter2())     // 출력 : 1
    println(counter2())     // 출력 : 2
}