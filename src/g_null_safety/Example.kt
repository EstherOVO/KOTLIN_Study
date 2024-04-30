package g_null_safety

data class UserProfile(val name: String?, val email: String?)

fun printUserProfile(profile: UserProfile) {
    val userName = profile.name ?: "이름 없음"
    val userEmail = profile.email ?: "이메일 정보 기재되지 않음"

    println("이름 : ${userName}")
    println("이메일 : ${userEmail}")

//  자바의 isNull과 isEmpty를 합친 메서드
    userName.isNullOrEmpty()
}

fun main() {
    val userProfile = UserProfile("홍길동", null)
    printUserProfile(userProfile)
}