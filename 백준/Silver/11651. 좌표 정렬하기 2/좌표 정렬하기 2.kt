import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        list.add(Pair(st.nextToken().toInt(), st.nextToken().toInt()))
    }
    list.sortedWith(compareBy({ it.second }, { it.first })).forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    bw.flush()
    bw.close()
}