import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (n, position) = readLine().split(" ").map { it.toInt() }
        val list = readLine().split(" ").map { it.toInt() }
        val queue = ArrayDeque<Pair<Int, Int>>()
        list.forEachIndexed { index, i ->
            queue.addLast(i to index)
        }

        val answer = mutableListOf<Pair<Int, Int>>()

        var max = queue.maxBy { it.first }.first

        while (queue.isNotEmpty()) {
            if (queue.first().first < max) {
                queue.addLast(queue.removeFirst())
            } else {
                answer.add(queue.removeFirst())
                if (queue.isNotEmpty()) {
                    max = queue.maxBy { it.first }.first
                }
            }
        }
        val index = answer.indexOf(answer.find { it.second == position })

        bw.write("${index+1}\n")
    }

    bw.flush()
    bw.close()
}