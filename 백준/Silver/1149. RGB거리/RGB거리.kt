import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = readLine().toInt()
    val array = Array(size) { Array(3) { 0 } }
    val dp = Array(size) { Array(3) { 0 } }

    repeat(size) {
        val input = readLine().split(" ").map { it.toInt() }
        input.forEachIndexed { index, i ->
            array[it][index] = i
        }
    }

    array[0].forEachIndexed { index, i ->
        dp[0][index] = i
    }

    for (i in 1..array.lastIndex) {
        for(j in 0..2) {
            dp[i][j] = array[i][j] + dp[i - 1].filterIndexed { index, _ -> index != j }.minOrNull()!!
        }
    }

    bw.write(dp.lastOrNull()!!.minOrNull()!!.toString())

    bw.flush()
    bw.close()
}