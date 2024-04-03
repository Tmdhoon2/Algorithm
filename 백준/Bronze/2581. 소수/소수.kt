import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val start = readLine().toInt()
    val end = readLine().toInt()

    val array = Array(end + 1) { 1 }

    for (i in 2..end) {
        for (j in i * 2..end step i) {
            array[j] = 0
        }
    }

    array[0] = 0
    array[1] = 0

    val result = array.mapIndexed { index: Int, i: Int -> if (i == 1) index else 0 }.subList(start, end + 1)
        .filter { it != 0 }
    
    if(result.isEmpty()) {
        bw.write("-1")
    } else {
        bw.write("${result.sum()}\n")
        bw.write("${result.minOrNull()!!}")
    }

    bw.flush()
    bw.close()
}