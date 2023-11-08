import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val array = Array(41) { 0 }

fun fiv(n: Int): Int {
    array[0] = 1
    array[1] = 1
    for (i in 2..n) {
        array[i] = array[i - 1] + array[i - 2]
    }
    return array[n]
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    bw.write("${fiv(n-1)} ${n-2}")
    bw.flush()
    bw.close()
}