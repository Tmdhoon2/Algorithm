import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (size, count) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.toMutableList()
    for (i in 1..list.lastIndex) {
        list[i] = list[i] + list[i - 1]
    }

    repeat(count) {
        val input = readLine().split(" ").map { it.toInt() }
        val start = input[0] - 1
        val end = input[1] - 1
        if (start == 0) {
            bw.write("${list[end]}\n")
        } else {
            bw.write("${list[end] - list[start - 1]}\n")
        }
    }

    bw.flush()
    bw.close()
}