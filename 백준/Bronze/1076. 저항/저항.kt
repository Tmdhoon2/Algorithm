import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val colors = listOf(
        "black",
        "brown",
        "red",
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white",
    )
    val map = mutableMapOf<String, Pair<Int, Long>>()

    colors.forEachIndexed { index, s ->
        map[s] = Pair(index, Math.pow(10.0, index.toDouble()).toLong())
    }

    var s = ""

    repeat(2) {
        s += map[readLine()]?.first
    }

    bw.write((s.toLong() * map[readLine()]!!.second).toString())
    bw.flush()
    bw.close()
}