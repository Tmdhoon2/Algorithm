import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val size = readLine().toInt()
    val original = Array(size) { 0 }
    val dp = Array(size) { 0 }

    repeat(size) {
        original[it] = readLine().toInt()
    }

    if (size < 3) {
        bw.write(original.sum().toString())
    } else {
        dp[0] = original[0]
        dp[1] = original[0] + original[1]
        dp[2] = maxOf(maxOf(original[0], original[1]) + original[2], original[0] + original[1])

        for (i in 3 until original.size) {
            dp[i] = maxOf(maxOf(dp[i - 1], dp[i-3] + original[i - 1] + original[i]), dp[i - 2] + original[i])
        }

        //bw.write(dp.toList().toString() + "\n")
        bw.write(dp.max().toString())
    }

    bw.flush()
    bw.close()
}