package e_control

fun main() {

//  when : 자바의 switch-case 문에 대응
//  switch-case 문보다 유연하게 복잡한 표현식도 사용 가능
    val number = 2

//  switch → when
    when (number) {
//      case를 입력받는 대신 when에서 받은 값을 바로 분기
        1 -> println("1번 메뉴입니다.")
        2 -> println("2번 메뉴입니다.")
        3 -> println("3번 메뉴입니다.")
        else -> println("잘못 입력하셨습니다.")
    }

//  범위를 조건으로 사용 가능
    val score = 70
    when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

//  when 조건문의 결과(분기)도 표현식으로 변수나 리턴 값에 대입 가능
    val grade1 = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("${score}점은 ${grade1} 등급입니다.")

//  특정 변수가 아닌 외부 조건 표현식 검사에도 사용 가능
    val grade2 = when {
        score >= 90 -> "A"
        score >= 90 -> "B"
        score >= 70 -> "C"
        else -> "D"
    }

    fun getUserRole(userType: Int): String {
        return when (userType) {
            1 -> "관리자"  // 단독
            2, 3 -> "열심회원"      // 여러 개
            in 4..7 -> "일반회원"   // 범위
            else -> "기타회원"
        }
    }

    val userType = 5
    println("${userType}번은 ${getUserRole(userType)}입니다.")
}