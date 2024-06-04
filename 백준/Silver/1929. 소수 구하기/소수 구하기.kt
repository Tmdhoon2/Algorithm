import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val array = Array(b + 1) { 1 }

    array[0] = 0
    array[1] = 0

    for (i in 2..Math.sqrt(b.toDouble()).toInt() + 1) {
        if (array[i] == 1) {
            for (j in (i * 2)..b step i) {
                array[j] = 0
            }
        }
    }

    val result = array.toList().mapIndexed { index, n ->
        if (n == 1) index
        else 0
    }

    result.slice(a..b).forEach {
        if (it != 0) {
            bw.write(it.toString())
            bw.write("\n")
        }
    }

    bw.flush()
    bw.close()
}