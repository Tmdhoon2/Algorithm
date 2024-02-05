import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.ceil

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val array = Array(10) { 0 }

    readLine().forEach {
        array[Integer.parseInt(it.toString())] += 1
    }

    val result = ceil(((array[6] + array[9]) / 2.0)).toInt()
    array[6] = result
    array[9] = result

    bw.write(array.maxOrNull()!!.toString())
    bw.flush()
    bw.close()
}