import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var input = readLine().toInt()
    var isMyTurn = false
    var count = 1
    while (input > 0) {
        isMyTurn = !isMyTurn
        input -= count
        count ++
    }

    if(isMyTurn){
        bw.write("${0 - input}")
    } else {
        if (input == 0) {
            bw.write(count.toString())
        } else {
            bw.write("0")
        }
    }

    bw.flush()
    bw.close()
}