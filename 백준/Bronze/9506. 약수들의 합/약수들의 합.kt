import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine().toInt()
        if (input == -1) {
            break
        } else {
            var list = intArrayOf()
            list += 1
            for (i in 2..input - 1) {
                if (input % i == 0) list += i
            }
            if (list.sum() == input) {
                bw.write("$input = ${list.toList().toString().replace(",", " +").replace("[", "").replace("]", "")}\n")
            } else {
                bw.write("$input is NOT perfect.\n")
            }
        }
    }

    bw.flush()
    bw.close()
}