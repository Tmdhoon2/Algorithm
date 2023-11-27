import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()

    val dpTable = Array(301) { 0 }
    val input = Array(301) { 0 }

    repeat(count) {
        input[it + 1] = readLine().toInt()
    }

    dpTable[1] = input[1]
    dpTable[2] = input[2] + dpTable[1]
    dpTable[3] = input[3] + max(input[2], dpTable[1])

    for (i in 4..count) {
        dpTable[i] = input[i] + max((input[i - 1] + dpTable[i-3]), dpTable[i - 2])
    }

    bw.write(dpTable[count].toString())
    bw.flush()
    bw.close()
}