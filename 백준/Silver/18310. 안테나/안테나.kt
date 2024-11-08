import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.toMutableList()
    list.sort()
    when(list.size % 2) {
        0 -> {
            println(list[list.size / 2 - 1])
        }

        else -> {
            println(list[list.size / 2])
        }
    }
}