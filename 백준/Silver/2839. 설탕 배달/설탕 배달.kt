import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var answer = 0
    var input = readLine().toInt()

    if (input % 5 == 0) {
        answer = input / 5
        bw.write(answer.toString())
    } else {
        while (input > 2) {
            input -= 3
            answer++
            while (input % 5 == 0 && input > 0) {
                input -= 5
                answer++
            }
        }

        if (input != 0) {
            bw.write("-1")
        } else {
            bw.write(answer.toString())
        }
    }

    bw.flush()
    bw.close()
}