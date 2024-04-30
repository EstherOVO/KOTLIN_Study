package b_type

fun main() {

//  자바에서 문자열을 출력하는 방식
    val name = "홍길동"
    val age = 30
    println("이름은 " + name + "이고, 나이는 " + age + "살 입니다.")

//  문자열 템플릿 $ 사인을 통해 변수의 값을 대입 가능
    println("이름은 $name 이고, 나이는 $age 살 입니다.")
    println("이름은 ${name}이고, 나이는 ${age * 2}살 입니다.")  //  ${변수명}을 통해서 문자열 내부에 표현식을 포함할 수 있다.(계산식도 가능)
}