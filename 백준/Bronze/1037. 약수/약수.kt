import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine()
    val input = readLine().split(" ").map { it.toInt() }

    val result = input.max().toInt() * input.min().toInt()

    bw.write(result.toString())
    bw.flush()
    bw.close()
}