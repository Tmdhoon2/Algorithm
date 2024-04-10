import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val size = readLine().toInt()
    val array = Array(size) { Array(size) { 0 } }
    val dp = Array(size) { Array(size) { 0 } }

    repeat(size) {
        readLine().split(" ").mapIndexed { index: Int, s: String -> array[it][index] = s.toInt() }
    }

    dp[0][0] = array[0][0]

    for (i in 0..array.lastIndex - 1) {
        dp[i].toList().slice(0..i).forEachIndexed { index, element ->
            val result = array[i + 1][index] + element
            val result1 = array[i + 1][index + 1] + element
            if (dp[i + 1][index] < result) {
                dp[i + 1][index] = result
            }
            if (dp[i + 1][index + 1] < result1) {
                dp[i + 1][index + 1] = result1
            }
        }
    }

    bw.write(dp.lastOrNull()!!.maxOrNull()!!.toString())

    bw.flush()
    bw.close()
}