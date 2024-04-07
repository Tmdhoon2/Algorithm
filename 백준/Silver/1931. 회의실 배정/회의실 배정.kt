import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Pair<Int, Int>>()
    var answer = 1
    val count = readLine().toInt()
    repeat(count) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        list.add(start to end)
    }
    list.sortWith(
        compareBy(
            { it.second },
            { it.first },
        ),
    )
    if (list.isNotEmpty()) {
        var end = list[0].second
        for (i in 1 until list.size) {
            if (list[i].first >= end) {
                answer++
                end = list[i].second
            }
        }
        bw.write(answer.toString())
    } else {
        bw.write("1")
    }
    bw.flush()
    bw.close()
}