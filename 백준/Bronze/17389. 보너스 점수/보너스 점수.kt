import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = readLine().map { it.toString() }

    var bonus = 0
    var current = 0

    list.forEachIndexed { index, s ->
        when (s) {
            "O" -> {
                current += index + 1 + bonus
                bonus ++
            }
            "X" -> {
                bonus = 0
            }
        }
    }

    println(current)
}