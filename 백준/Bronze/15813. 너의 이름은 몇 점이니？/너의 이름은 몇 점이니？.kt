import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val count = readLine().toInt()
    var sum = 0
    ('A'..'Z').run {
        readLine().forEach {
            sum += this.indexOf(it) + 1
        }
    }
    bw.write(sum.toString())
    bw.flush()
    bw.close()
}