package t_lazy

class Lazy {

//  프로퍼티로 사용되는 경우 반드시 초기화 되어야 한다.
//  val lazyValue: String
//  lateinit val lazyValue: String      val에는 lateinit 키워드 사용 불가
    val lazyValue: String by lazy {
        println("로직 수행...")
        "안녕하세요, 지연 초기화입니다."
    }
}

fun main() {

    val lazyValue: String       // 지역 변수에서 초기 값이 없을 경우
    lazyValue = "초기값"         // 1회에 한하여 초기화 가능
//  lazyValue = "변경 불가"     2번 째부터는 변경 불가

    val lazy = Lazy()           // 객체 생성
    println(lazy.lazyValue)     // getter 호출
//  프로퍼티가 초기 값을 가지고 있지 않다가 getter가 호출되는 순간 초기화가 수행된다.
}