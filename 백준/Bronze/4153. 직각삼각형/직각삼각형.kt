import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine().split(" ").map { it.toDouble() }.toMutableList()
        if (input[0] == 0.0) break

        val max = input.max()
        input.remove(max)

        bw.write(if (max.pow(2.0) == (input[0].pow(2) + input[1].pow(2))) "right\n" else "wrong\n")
    }
    bw.flush()
    bw.close()
}