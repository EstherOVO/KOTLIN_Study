package p_extension

// 만약 원래 기존 멤버 함수와 확장 함수의 시그니처가 같은 경우
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main() {

//  멤버 함수가 우선적으로 호출된다. → 확장 함수 호출 시 유의! 멤버 함수 변경 시 전부 변경될 수 있음
    val person = Person("홍길동", 30)
    println(person.nextYear())  // 멤버 함수 / 31
}