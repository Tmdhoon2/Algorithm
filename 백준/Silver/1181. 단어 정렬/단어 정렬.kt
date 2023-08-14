import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableSetOf<Pair<String, Int>>()
    repeat(readLine().toInt()) {
        val input = readLine()
        list.add(input to input.length)
    }
    list.sortedWith(compareBy({ it.second }, { it.first })).forEach {
        bw.write("${it.first}\n")
    }
    bw.flush()
    bw.close()
}