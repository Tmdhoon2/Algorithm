
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()

    val table = Array(41) { 0 to 0 }
    table[0] = 1 to 0
    table[1] = 0 to 1

    for (i in 2..40) {
        val first = table[i - 1]
        val second = table[i - 2]
        table[i] = first.first + second.first to first.second + second.second
    }

    repeat(count) {
        val input = readLine().toInt()
        bw.write("${table[input].first} ${table[input].second}\n")
    }

    bw.flush()
    bw.close()
}