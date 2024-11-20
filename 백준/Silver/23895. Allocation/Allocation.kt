import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        val (size, max) = readLine().split(" ").map { it.toInt() }
        val list = readLine().split(" ").map { it.toInt() }.toList().sorted()
        var sum = 0
        var count = 0
        for (i in 0 until list.size) {
            if (sum + list[i] <= max) {
                sum += list[i]
                count ++
            }
        }

        println("Case #${it + 1}: $count")
    }
}