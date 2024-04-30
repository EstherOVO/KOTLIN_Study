package i_function

/*
연습 문제 3 : 온도 변환기

섭씨온도를 화씨온도로 변환하는 함수를 작성하세요.
사용자로부터 섭씨온도를 입력받고, 화씨온도로 변환한 결과를 출력합니다.

요구사항 :
- 함수 이름은 convertCelsiusToFahrenheit로 하세요.
- 섭씨온도는 Double 타입으로 입력받으세요.
- 화씨온도 변환 공식은 {(섭씨온도 * 9/5) + 32} 입니다.
- 결과는 소수점 두 자리까지 출력하세요.
- 단일행 함수로 작성하세요.

출력 예시 :
섭씨 온도를 입력하세요 :
20
화씨 온도는 68.00입니다.
*/

fun main() {

    print("섭씨온도를 입력해 주세요 : ")
    val celsius = readLine()

    if (!celsius.isNullOrEmpty()) {
        convertCelsiusToFahrenheit(celsius.toDouble())
    }
}

fun convertCelsiusToFahrenheit(celsius: Double) {

    val fahrenheit = (celsius * 9/5) + 32

    println("화씨온도는 ${"%.2f".format(fahrenheit)}도 입니다.")
}