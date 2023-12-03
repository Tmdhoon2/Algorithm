import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    val array = Array(1000001) { 0 }

    array[2] = 1
    array[3] = 1

    for (i in 4..n) {
        array[i] = array[i - 1] + 1
        if (i % 3 == 0) {
            array[i] = min(array[i / 3] + 1, array[i])
        }
        if (i % 2 == 0) {
            array[i] = min(array[i / 2] + 1, array[i])
        }
    }

    bw.write(array[n].toString())
    bw.flush()
    bw.close()
}