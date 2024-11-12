import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val (s, p) = readLine().split(" ")
        map[s] = p.toInt()
    }

    var default = 0

    repeat(k) {
        val input = readLine()
        default += map[input]!!
        map.remove(input)
    }

    var max = default
    var min = default

    val sortedMap = map.toList().sortedBy { it.second }.toMap()
    val keys = sortedMap.keys.toMutableList()

    for(i in 0 until m - k) {
        min += sortedMap[keys[i]]!!
    }

    keys.reverse()

    for(i in 0 until m - k) {
        max += sortedMap[keys[i]]!!
    }

    println("$min $max")
}