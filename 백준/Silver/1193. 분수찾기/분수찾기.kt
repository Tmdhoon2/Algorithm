import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine().toLong()
    var count = 0L
    var current = 1L

    var run = true

    while (run) {
        for (i in 1 until current + 1) {
            if(count == input - 1) {
                bw.write(if (current % 2 == 0L) {
                    "$i/${current + 1 - i}"
                } else {
                    "${current + 1 - i}/$i"
                })
                run = false
                break
            }
            count++
        }
        current++
    }

    bw.flush()
    bw.close()
}