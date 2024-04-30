package i_function

/*
연습 문제 2 : 인사말 생성기

사용자의 이름과 옵션으로 시간(오전/오후)을 입력받아,
적절한 인사말을 반환하는 함수를 작성하세요. 시간은 기본값으로 "오전"을 가집니다.

요구사항 :
- 함수 이름은 greet로 하세요.
- 이름은 필수로 받으며, 시간은 기본값을 사용할 수 있어야 합니다.
- "오전"일 경우 "Good morning, [name]!"을, "오후"일 경우 "Good afternoon, [name]!"을 반환하세요.
*/

fun main() {

    println(greet("Esther"))
    println(greet("Esther", "오후"))
}

fun greet(name: String, time: String = "오전") : String = if (time == "오전") "Good morning, ${name}!" else "Good afternoon, ${name}!"