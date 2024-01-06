import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (x, y, w, h) = readLine().split(" ").map { it.toInt() }

    val list = mutableListOf<Int>().apply {
        add(x - 0)
        add(y - 0)
        add(w - x)
        add(h - y)
    }

    bw.write(list.minOrNull().toString())
    bw.flush()
    bw.close()
}