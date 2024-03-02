import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().toInt()
    var result = 0

    for (i in 1..input) {
        if(input == i + i.toString().map { Integer.parseInt(it.toString()) }.sum()){
            result = i
            break
        }
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()
}