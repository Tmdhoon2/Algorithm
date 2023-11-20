import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(10000) { 0 }

    array[1] = 1
    array[2] = 2
    array[3] = 4

    repeat(readLine().toInt()) {
        val input = readLine().toInt()

        for (i in 4..input) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3]
        }

        bw.write("${array[input]}\n")
    }

    bw.flush()
    bw.close()
}