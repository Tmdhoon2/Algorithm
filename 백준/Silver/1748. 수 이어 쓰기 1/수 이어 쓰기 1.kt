import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var answer = 0

    val input = readLine()

    with(input.length) {
        if (this == 1) {
            answer += input.toInt()
        } else {
            for (i in 1..this) {
                val first = Math.pow(10.0, i - 1.0).toInt()
                val second = if (i == this) input.toInt()
                else Math.pow(10.0, i.toDouble()).toInt() - 1

                answer += (second - first + 1) * i
            }
        }
    }

    bw.write(answer.toString())
    bw.flush()
    bw.close()
}