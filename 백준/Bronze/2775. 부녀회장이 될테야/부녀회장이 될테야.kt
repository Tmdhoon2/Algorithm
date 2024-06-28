import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readLine().toInt()) {
        val k = readLine().toInt()
        val n = readLine().toInt()

        val array = Array(k + 1) { Array(n) { 0 } }

        for (i in 0 until n) {
            array[0][i] = i + 1
        }

        for (i in 1..k) {
            var sum = 0
            for (j in 0 until n) {
                sum += array[i - 1][j]
                array[i][j] = sum
            }
        }

        bw.write("${array[k][n - 1]}\n")
    }

    bw.flush()
    bw.close()
}