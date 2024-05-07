package s_scope_function

fun main() {

//  1. let
    val name: String? = null
    val length: Int? = name?.let {
        println("제 이름은 ${it}입니다.")
        it.length
    } ?: 0
    println("length = ${length}")

//  let 사용하지 않은 경우
    var name2: String? = null
    val length2 = if (name != null) {
        println("제 이름은 ${name}입니다.")
        name.length
    } else {
        null
    }
    println("length2 = ${length2}")

//////////////////////////////////////////////////////////

//  2. run
    val result = "코틀린".run {
        println("수신 객체의 길이는 ${this.length} 입니다.")
        this.length
    }
    println("result = ${result}")

//  run 사용하지 않은 경우
    val runName = "코틀린"
    println("수신 객체의 길이는 ${runName.length} 입니다.")
    val result2 = runName.length

//////////////////////////////////////////////////////////

//  3. apply
    class Person {
        var name = ""
        var age = 0
    }

    val person: Person = Person().apply {
        this.name = "임꺽정"
        this.age = 30
    }
    println("${person.name}은 ${person.age}세 입니다.")

//  apply 사용하지 않은 경우
    val person2 = Person()
    person.name = "홍길동"
    person.age = 30

//////////////////////////////////////////////////////////

//  4. also
    val mutableList = mutableListOf(1, 2, 3).also {
        println("리스트 : ${it}")
        it.add(4)
    }
    println("mutableList = ${mutableList}")

//  also 사용하지 않는 경우
    println("리스트 : ${mutableList}")
    mutableList.add(5)

//////////////////////////////////////////////////////////

//  5. with
    val sb = StringBuilder()
    val str: String = with(sb) {
        append("안녕하세요")
        append("여기는 스콥 함수 내부입니다.")
        append("수신 객체가 하는 일을 편하게 해주고, 메서드 체이닝처럼 해줍니다.")
        toString()
    }

//  with 사용하지 않는 경우
    val builder = StringBuilder()
    builder.append("안녕하세요 ")
    builder.append("반갑습니다 ")
    val str2 = builder.toString()
}