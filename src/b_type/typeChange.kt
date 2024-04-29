package b_type

fun main() {

//  자료형 변환
    var number : Int = 50
//  자바의 더 큰 범위로 타입 변환(Promotion) 발생하지 않는다.
//  명시적으로 타입 변환이 필요하다.
    var bigNumber : Long = number.toLong()

    var byteNumber : Byte = number.toByte() // 다운 캐스팅 Casting의 경우도 동일

//  문자열로 변경하고 싶을 경우
    val string : String = number.toString()

//  변환 타입에 맞는 값이 아닐 경우 런타입 Exception이 발생
    val name : String = "홍길동"
//  val name : String = "100"   컴파일 에러 발생하지 않음
    val longNumber : Long = name.toLong()
    println(longNumber)
}