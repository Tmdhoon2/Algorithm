import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (w, h) = readLine().split(" ").map { it.toDouble() }

    bw.write((w * h / 2).toString())

    bw.flush()
    bw.close()
}