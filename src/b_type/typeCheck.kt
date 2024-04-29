package b_type

// 자바에서는 instanceOf 를 통해 어떤 타입인지 체크 가능
// 코틀린에서는 조금 더 안전한 방법을 제공

fun main() {

    val obj : Any = "문자열"

//  is 연산자 : 객체가 특정 타입의 인스턴스인지 검사하고, 결과를 true / false로 리턴
    if (obj is String) {
//      is의 검사가 참일 경우 별도로 캐스팅할 필요가 없다.
//      스마트 캐스팅 Any → String
        println(obj.startsWith("문"))
//      String 타입에서 쓸 수 있는 메서드, 프로퍼티 등을 사용할 수 없다.
        obj.length
    } else {
//      is의 검사가 false인 경우 캐스팅하지 않는다.
//      obj.length  컴파일 에러 발생
    }

//  반대의 경우를 검사
    if (obj !is String) {
//      obj.length  문자열로 캐스팅 하지 않음
    } else {
        obj.length  // 문자열 캐스팅
    }

//  as 연산자 : 강제로 타입을 캐스팅
    val num : Any = 1234    // "1234"로 변경하면 ClassCastException 발생 X
    val numStr = num as String  // ClassCastException
//  Int → String

//  as? 연산자 : 안전한 캐스팅
//  만약 해당 타입으로 캐스팅이 되지 않을 경우 ClassCastException을 발생시키는 대신 null을 리턴
    val safeNumStr = num as? String
    println("캐스팅 결과 : " + safeNumStr)
}