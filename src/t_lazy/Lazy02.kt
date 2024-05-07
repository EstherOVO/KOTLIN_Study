package t_lazy

// 지연 초기화된 프로퍼티
val primeNumbers: List<Int> by lazy {
    println("소수를 계산하고 있습니다.")
    (2..1000).filter { isPrime(it) }
}

// 소수 판별을 위한 함수
fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2 until number) {
        if (number % i == 0) return false
    }
    return true   // 나누어 떨어지지 않으면 소수
}

fun main() {

    println("primeNumbers에 접근하지 전 (계산 수행되지 않음)")
    println(primeNumbers)   // 해당 시점에 계산이 수행된다. → 메모리에 저장
    println(primeNumbers)   // 두 번째 접근 이후부터는 계산을 하지 않고 저장된 값을 가져온다.
}