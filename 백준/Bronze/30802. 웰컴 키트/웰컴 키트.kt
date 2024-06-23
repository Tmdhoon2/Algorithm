import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }
    val (a, b) = readLine().split(" ").map { it.toInt() }

    var t = 0

    list.forEach {
        if (it != 0) {
            if (it < a) {
                t += 1
            } else {
                t += it / a
                if (it % a != 0) {
                    t += 1
                }
            }
        }
    }

    bw.write(t.toString())
    bw.write("\n")
    bw.write("${size / b} ${size % b}")

    bw.flush()
    bw.close()
}
