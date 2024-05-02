import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val size = readLine().toInt()
    val array = Array(size + 2) { 0 }
    array[0] = 0
    array[1] = 1
    array[2] = 1
    for (i in 3..size) {
        array[i] = array[i - 1] + array[i - 2]
    }

    bw.write(array[size].toString())

    bw.flush()
    bw.close()
}