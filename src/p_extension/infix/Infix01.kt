package p_extension.infix

// 확장 함수
fun Int.addExt(other: Int): Int {
    return this + other
}

fun main() {

    println(1.addExt(2))    // 확장 함수 사용
    println(3 add 4)              // 중위 함수 사용
}

// 중위 함수(Infix Notation)
infix fun Int.add(other: Int): Int {
    return this + other
}