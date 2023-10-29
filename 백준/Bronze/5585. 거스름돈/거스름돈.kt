import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = 1000 - readLine().toInt()

    var count = 0

    while (input != 0) {
        if (input >= 500) {
            input -= 500
            count += 1
        } else if (input >= 100) {
            input -= 100
            count += 1
        } else if (input >= 50) {
            input -= 50
            count += 1
        } else if (input >= 10) {
            input -= 10
            count += 1
        } else if (input >= 5) {
            input -= 5
            count += 1
        } else {
            input -= 1
            count += 1
        }
    }

    bw.write(count.toString())
    bw.flush()
    bw.close()
}