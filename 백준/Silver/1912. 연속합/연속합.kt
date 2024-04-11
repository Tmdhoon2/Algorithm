import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = readLine().toInt()
    val array = readLine().split(" ").map { it.toInt() }
    val dp = Array(size) { 0 }
    dp[0] = array[0]

    for (i in 0 until array.lastIndex) {
        dp[i + 1] = maxOf(array[i + 1], dp[i] + array[i + 1])
    }

    bw.write(dp.maxOrNull()!!.toString())

    bw.flush()
    bw.close()
}