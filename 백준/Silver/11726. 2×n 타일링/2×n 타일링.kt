import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val dpTable = Array(1001) { 0 }

    dpTable[1] = 1
    dpTable[2] = 2
    dpTable[3] = 3

    if (n > 3) {
        for (i in 4..n) {
            dpTable[i] = (dpTable[i - 1] + dpTable[i - 2]) % 10007
        }
    }

    bw.write(dpTable[n].toString())
    bw.flush()
    bw.close()
}