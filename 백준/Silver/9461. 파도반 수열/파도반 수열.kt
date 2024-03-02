import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dp = Array(101) { 0L }
    dp[0] = 1
    dp[1] = 1
    dp[2] = 1
    dp[3] = 2
    dp[4] = 2

    var inputs = intArrayOf()

    repeat(readLine().toInt()) {
        val input = readLine().toInt()
        inputs += input
        if(dp[input] == 0L) {
            for (i in 5..input) {
                dp[i] = dp[i - 1] + dp[i - 5]
            }
        }
    }

    inputs.forEach {
        bw.write("${dp[it - 1]}\n")
    }

    bw.flush()
    bw.close()
}