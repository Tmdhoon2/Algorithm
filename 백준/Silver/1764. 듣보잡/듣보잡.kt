import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())

    val (n, m) = st.nextToken().toInt() to st.nextToken().toInt()
    val map = mutableMapOf<String, Int>()

    repeat(n) {
        map[readLine()] = 1
    }

    repeat(m) {
        val input = readLine()
        map[input] = map.getOrDefault(input, 0) + 1
    }

    map.filter { it.value == 2 }.toSortedMap().run {
        bw.write("${this.size}\n")
        forEach { bw.write("${it.key}\n") }
    }

    bw.flush()
    bw.close()
}