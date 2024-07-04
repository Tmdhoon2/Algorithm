import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, x) = readLine().split(" ").map { it.toInt() }
    var max = -1
    repeat(n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        if (a + b <= x && a > max) {
            max = a
        }
    }

    bw.write(max.toString())

    bw.flush()
    bw.close()
}