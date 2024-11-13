import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (l, n) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, String>()
    repeat(l) {
        readLine().split(" ").run {
            map[this[0]] = this[1]
        }
    }

    repeat(n) {
        readLine().run {
            if (map.contains(this)) {
                println(map[this]!!)
            } else {
                println(change(this))
            }
        }
    }
}

private fun change(s: String): String {
    val list = listOf("o", "s", "ch", "sh", "x")
    val vowels = listOf("a", "e", "i", "o", "u")

    if (s.last() == 'y') {
        return if (!vowels.contains(s[s.lastIndex - 1].toString())) {
            "${s.slice(0..s.lastIndex - 1)}ies"
        } else {
            "${s}s"
        }
    }

    list.forEach {
        if (s.endsWith(it)) {
            return "${s}es"
        }
    }

    return "${s}s"
}