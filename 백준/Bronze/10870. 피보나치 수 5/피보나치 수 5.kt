import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val array = Array(21) { 0 }

    array[0] = 0
    array[1] = 1

    for(i in 2 .. n) {
        array[i] = array[i - 1] + array[i - 2]
    }
    
    bw.write(array[n].toString())

    bw.flush()
    bw.close()
}