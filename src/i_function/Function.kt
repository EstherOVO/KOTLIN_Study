package i_function

// 함수 선언

// 자바 : public int max(int a, int b) {}

// 코틀린 함수 선언
// fun 키워드 사용
// 리턴 타입이 매개변수 리스트 뒤에 콜론(:)과 함께 명시
// 코틀린은 기본 접근 제한자가 public → 생략 가능
// public fun max(int a, int b) {}

fun max(a: Int, b: Int) : Int {

    if (a > b) {
        return a
    }
    return b
}

// 코틀린에서 if-else 문은 Expression
fun maxK1(a: Int, b: Int) : Int {
    return if (a > b) { a } else { b }
}

// 중괄호 생략
fun maxK2(a: Int, b: Int) : Int {
    return if (a > b) a else b
}

// 함수의 본문이 단일 표현식인 경우 return 생략 가능(equal 사인 대입)
fun maxK3(a: Int, b: Int) : Int = if (a > b) a else b

// 반환 타입이 추론 가능한 경우 생략 가능
fun maxK4(a: Int, b: Int) = if (a > b) a else b

fun main() {

//  함수 호출 방식은 동일
    println(maxK1(1, 2))
    println(maxK2(3, 4))
    println(maxK3(4, 5))
    println(maxK4(7, 6))
}