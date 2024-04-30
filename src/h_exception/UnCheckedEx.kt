package h_exception

import java.io.BufferedReader
import java.io.FileReader

fun readFile() {

//  예외 떠넘기기가 된 Exception을 처리하지 않아도 됨
//  코틀린에서는 모든 예외가 UnChecked Exception
    val reader = BufferedReader(FileReader("README.md"))
    val line = reader.readLine()
    println(line)
    reader.close()
//  예외가 발생하지 않는 것이 아니라, 발생 예상되는 예외를 따로 적절한 예외 처리를 하면 된다.
}

fun main() {

    readFile()
}