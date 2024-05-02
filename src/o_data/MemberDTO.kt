package o_data

import java.util.Objects

// 기본적으로 프로퍼티(Getter + Setter)
// equals, hashCode, toString 자동으로 만들어 준다.
// 생성자는 선언부
data class MemberDTO(val name: String, val age: Int) {

/*
    equals(), hashCode, toString을 오버라이딩 하고 싶다면...

    override fun hashCode(): Int {
        return Objects.hashCode(name)
    }

    override fun toString(): String {
        return "Name = ${name} : Age = ${age}"
    }
*/
}

fun main() {

    val member1 = MemberDTO("홍길동", 30)
    val member2 = MemberDTO("임꺽정", 40)
    val member3 = MemberDTO("홍길동", 30)

//  equals()
    println(member1 == member2)     // false
    println(member1 == member3)     // true

//  toString()
    println(member1)

//  hashCode()
    println(member1.hashCode())
    println(member2.hashCode())
    println(member3.hashCode())
//  member1과 member3 hashCode 동일

//  copy()
//  프로퍼티를 복사하되, 복사 시 일부 프로퍼티 값을 변경하는 옵션 제공
    val member1Old = member1.copy(age = 31)
    println(member1Old)

//  destructing declaration 구조분해 할당
//  데이터 클래스의 내부 프로퍼티를 각각의 이름의 변수에 할당
    val (name, age) = member1

    println("${name}은 ${age}세 입니다.")

//  Component Function
//  데이터 클래스의 각 프로퍼티에 대해 자동으로 생성된다.
//  componentN → N은 프로퍼티 갯수
    println(member2.component1())   // member2.name
    println(member2.component2())   // member2.age
}
