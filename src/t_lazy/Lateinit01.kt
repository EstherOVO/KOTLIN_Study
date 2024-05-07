package t_lazy

class Person {

//  var name: String    프로퍼티는 반드시 초기화해야 한다.
//  var name: String? = null
//  만약 초기 값으로 null을 준다면, 해당 프로퍼티를 사용하는 모든 곳에서 nullable과 Safe Call을 사용해야 하는 문제가 발생한다.

    lateinit var name: String
//  lateinit : nullable로 사용하지 않으면서 초기화를 뒤로 미룰 수 있다.

    fun initName(name: String) {
        this.name = name
    }

    fun printName() {
        val initialized = this::name.isInitialized    // 초기화가 완료되면 true(코틀린 프로퍼티 KProperty 리플렉션의 속성)

        if (initialized) {
            println("이름은 ${name}")
        } else {
            println("이름이 아직 초기화되지 않았습니다.")
        }
    }
}

fun main() {

    val person = Person()

    person.printName()  // name 이 초기화가 되지 않은 시점
//  UninitializedPropertyAccessException
//  초기화가 되지 않은 시점에서 해당 프로퍼티 접근 시 예외 발생

    person.initName("길동")   // lateinit 프로퍼티는 이 시점에 초기화된다.
    person.printName()
}