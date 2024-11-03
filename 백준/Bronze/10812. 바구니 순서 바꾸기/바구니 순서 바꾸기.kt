import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (size, count) = readLine().split(" ").map { it.toInt() }
    var list = List(size) { it + 1 }.toMutableList()
    repeat(count) {
        val (start, end, middle) = readLine().split(" ").map { it.toInt() }
        list = switch(
            start = start,
            end = end,
            middle = middle,
            original = list,
        )
    }

    list.forEach {
        print("$it ")
    }
}

private fun switch(
    start: Int,
    end: Int,
    middle: Int,
    original: List<Int>,
): MutableList<Int> {
    val result = mutableListOf<Int>()
    for(i in 0 until start - 1) {
        result.add(original[i])
    }
    for(i in middle..end) {
        result.add(original[i - 1])
    }
    for(i in start..middle - 1) {
        result.add(original[i - 1])
    }
    for(i in end + 1..original.size) {
        result.add(original[i - 1])
    }

    return result
}