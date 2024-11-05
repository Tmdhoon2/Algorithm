import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val farms = Array(n) { 0 }
    var sum = 0
    for (i in 0 until m) {
        val (t, r) = readLine().split(" ").map { it.toInt() }
        sum += r
        if (sum > k) {
            bw.write("${i + 1} 1")
            bw.flush()
            bw.close()
            return@with
        }
    }
    bw.write("-1")
    bw.flush()
    bw.close()
}