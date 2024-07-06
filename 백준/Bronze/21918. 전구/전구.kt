import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (size, n) = readLine().split(" ").map { it.toInt() }
    val lights = readLine().split(" ").map { it == "1" }.toMutableList()

    repeat(n) {
        val (a, b, c) = readLine().split(" ").map { it.toInt() }
        if (a == 1) lights[b - 1] = (c == 1)
        else for (i in (b - 1) until c) {
            lights[i] = when (a) {
                2 -> !lights[i]
                3 -> false
                else -> true
            }
        }
    }

    bw.write(lights.map { if (it) 1 else 0 }.joinToString(separator = " "))

    bw.flush()
    bw.close()
}