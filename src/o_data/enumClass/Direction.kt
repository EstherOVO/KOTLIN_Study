package o_data.enumClass

enum class Direction(val code: String) {

    NORTH("북"), SOUTH("남"), EAST("동"), WEST("서")
}

fun main() {

    val north = Direction.NORTH
    println(north)
    println(north.code)

    val direction = Direction.SOUTH

    if (direction == Direction.SOUTH) {
        println("${direction.code}쪽으로 갑니다.")
    }

    if (direction == Direction.NORTH) {
//      북쪽 관련 로직...
    }

//  ENUM 클래스와 when 문을 함께 사용
    handleDirection(Direction.WEST)
}

private fun handleDirection(direction: Direction) {

    when (direction) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")
    }
}