import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(100) { Array(100) { 0 } }

    repeat(readLine().toInt()) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        for (i in x until x + 10) {
            for (j in y until y + 10) {
                array[i][j] = 1
            }
        }
    }

    bw.write("${array.map { it.filter { it == 1 }.size }.sum()}")

    bw.flush()
    bw.close()
}