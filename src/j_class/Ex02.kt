package j_class

/*
연습 문제 2 : 커스텀 게터/세터를 포함한 온도 클래스 만들기

요구사항 :
- Temperature 클래스를 만드세요.
- 섭씨온도(celsius)를 프로퍼티로 저장합니다.
- 화씨온도(fahrenheit)를 커스텀 게터로 계산하여 반환하세요.
- 화씨온도(fahrenheit)를 커스텀 세터로 섭씨로 변환하여 저장하세요.
- 현재온도를 섭씨와 화씨로 표시하는 메서드를 작성하세요.

- 섭씨 → 화씨 : celsius * 9 / 5 + 32
- 화씨 → 섭씨 : (fahrenheit - 32) * 5 / 9
*/

fun main() {

    val temperature = Temperature(20.0)
    temperature.fahrenheit
    temperature.toCelsius
    temperature.getTemperature()
}

class Temperature(var celsius: Double) {

    val fahrenheit: Double get() = celsius * 9 / 5 + 32

    var toCelsius: Double
        get() = celsius
        set(fahrenheit) {
            celsius = (fahrenheit - 32) * 5 / 9
        }

    fun getTemperature() {
        println("섭씨온도 : ${toCelsius}도")
        println("화씨온도 : ${fahrenheit}도")
    }
}