import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()

    val index = input.length / 2

    val list = input.toList().subList(0, index)
    val subList = input.toList().subList(if (input.length % 2 == 0) index else index + 1, input.length)

    println(if (list == subList.reversed()) 1 else 0)
}