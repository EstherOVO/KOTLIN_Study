package p_extension

// 확장 함수 오버라이딩
open class Train(val name: String = "새마을호", val price: Int = 30000)

fun Train.isExpensive(): Boolean {
    println("Train 클래스의 확장 함수, 35000원보다 비싸면 True")
    return this.price >= 35000
}

class KTX : Train("KTX", 45000)

fun KTX.isExpensive(): Boolean {
    println("KTX 클래스의 확장 함수, 35000원보다 비싸면 True")
    return this.price >= 35000
}

fun main() {

    val train: Train = Train()
    println(train.isExpensive())    // Train 클래스 확장 함수

//  코틀린에서 확장 함수는 오버라이딩 될 수 없음
//  수신 객체 변수의 타입에 따라 확장 함수가 호출
    val ktx1: Train = KTX()     // 자바의 다형성에는 객체의 오버라이딩 된 메서드가 우선된다.
    println(ktx1.isExpensive())    // Train 클래스 확장 함수

    val ktx2: KTX = KTX()
    println(ktx2.isExpensive())    // KTX 클래스 확장 함수
}