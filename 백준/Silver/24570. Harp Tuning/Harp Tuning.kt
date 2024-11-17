import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine()
    val numbers = (0..9).toList().map { it.toString() }
    var startIndex = 0
    mutableListOf<String>().apply {
        input.forEachIndexed { index, c ->
            if (index != 0) {
                if (!numbers.contains(c.toString()) && numbers.contains(input[index - 1].toString())) {
                    add(input.slice(startIndex..index - 1))
                    startIndex = index
                }
            }
        }
        add(input.slice(startIndex..input.lastIndex))
    }.forEach {
        println(it.replace("+", " tighten ").replace("-", " loosen "))
    }
}