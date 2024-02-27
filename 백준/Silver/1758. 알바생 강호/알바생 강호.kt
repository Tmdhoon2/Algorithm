import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    mutableListOf<Long>().apply {
        var sum = 0L
        repeat(readLine().toInt()) {
            add(readLine().toLong())
        }
        sortDescending()
        forEachIndexed { index, l ->
            sum += if (l - index > 0) l - index else 0
        }

        bw.write(sum.toString())
    }
    bw.flush()
    bw.close()
}