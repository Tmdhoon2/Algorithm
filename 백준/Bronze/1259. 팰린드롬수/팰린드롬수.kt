import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()
        if (input == "0") break
        val length = input.length

        val first = input.substring(0..length / 2 - 1)
        val second = input.substring(length / 2 + length % 2..length - 1).reversed()

        bw.write(if (first == second) "yes\n" else "no\n")
    }

    bw.flush()
    bw.close()
}