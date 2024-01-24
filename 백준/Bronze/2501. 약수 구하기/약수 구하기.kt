import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (input, count) = readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<Int>()

    for (i in 1..Math.sqrt(input.toDouble()).toInt()) {
        if (input % i == 0) {
            set.add(i)
            set.add((input / i))
        }
    }

    set.sorted().toList().run {
        bw.write(getOrElse(count - 1) { 0 }.toString())
    }

    bw.flush()
    bw.close()
}