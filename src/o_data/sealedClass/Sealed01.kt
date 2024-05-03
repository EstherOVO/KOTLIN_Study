package o_data.sealedClass

// sealed : 봉인된
// 상속이 가능한 클래스를 만들고 싶지만, 외부에서는 상속받지 않으면 좋겠을 때 사용하는 클래스
// 정의된 패키지 내부에서만 상속이 가능한 클래스
// 제한된 상속 → 코드의 응집력을 높인다.

sealed class Transport(val name: String, val maxSpeed: Int)

class Car : Transport("아반떼", 120)

class Bus : Transport("타요", 130)

class Bicycle : Transport("씽씽이", 30)

object Tank : Transport("전차", 50)   // 싱글톤 객체도 상속 가능

// when 문에서 모든 가능한 하위 클래스 타입을 컴파일 시점에 체크
fun handleTransport(transport: Transport) {
    when (transport) {
        is Bicycle -> println("자전거 ${transport.name}이 ${transport.maxSpeed} km/h 로 질주합니다.") // 타입체크 필요
        is Bike -> println("바이크 ${transport.name}이 ${transport.maxSpeed} km/h 로 질주합니다.")    // 타입체크 필요
        is Bus -> println("버스 ${transport.name}이 ${transport.maxSpeed} km/h 로 질주합니다.")  // 타입체크 필요
        is Car -> println("자동차 ${transport.name}이 ${transport.maxSpeed} km/h 로 질주합니다.")     // 타입체크 필요
        Tank -> println("전차 ${transport.name}이 ${transport.maxSpeed} km/h 로 질주합니다.")  // 싱글톤 객체이므로 타입 체크 'is' 불필요
    }
}

fun main() {

    handleTransport(Car())
    handleTransport(Bus())
}