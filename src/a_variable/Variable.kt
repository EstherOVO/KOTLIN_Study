package a_variable

// 변수 선언
// val, var
val numVal = 10
var numVar = 10

fun main() {

//  val로 선언된 변수에는 값 재할당 불가
//  numVal = 20
//  var로 선언된 변수에는 값 재할당 가능
    numVar = 20

//  변수를 선언하고 초기 값을 지정해 주지 않은 경우
    var strVar : String = "초기 값"
    println(strVar)     // 컴파일 에러 발생

//  TIP! 모든 변수는 val로 우선 선언하고, 값이 변경될 경우에만 var로 변경한다.
}