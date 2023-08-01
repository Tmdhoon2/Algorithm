import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val sb = StringBuilder()
    var sum = 0

    input.forEach {
        sb.append(getNumber(it.lowercaseChar()))
    }

    sb.forEach {
        sum += it.toString().toInt() + 1
    }

    println(sum)
}

fun getNumber(char: Char): Int {
    var number = when (char) {
        in 'a'..'c' -> 2
        in 'd'..'f' -> 3
        in 'g'..'i' -> 4
        in 'j'..'l' -> 5
        in 'm'..'o' -> 6
        in 'p'..'s' -> 7
        in 't'..'v' -> 8
        in 'w'..'z' -> 9
        else -> 1
    }

    return number
}