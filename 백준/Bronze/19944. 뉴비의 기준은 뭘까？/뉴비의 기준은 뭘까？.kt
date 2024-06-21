import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }

    if (m <= 2) {
        bw.write("NEWBIE!")
    } else if (m <= n) {
        bw.write("OLDBIE!")
    } else {
        bw.write("TLE!")
    }

    bw.flush()
    bw.close()
}