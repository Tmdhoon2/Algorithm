import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var initial: Position1
private val queue = ArrayDeque<Position1>()
private lateinit var graph: Array<Array<Int>>

private val hList = listOf(-1, 0, 1, 0)
private val wList = listOf(0, 1, 0, -1)

private fun bfs(position: Position1) {
    queue.addLast(position)
    graph[position.h][position.w] = 0

    while (queue.isNotEmpty()) {
        queue.removeFirstOrNull()?.let { (h, w) ->
            for (i in 0..3) {
                val nextH = h + hList[i]
                val nextW = w + wList[i]

                if (nextH in 0 until initial.h && nextW in 0 until initial.w) {
                    if (graph[nextH][nextW] == 1) {
                        queue.addLast(
                            Position1(
                                h = nextH,
                                w = nextW,
                            )
                        )
                        graph[nextH][nextW] = graph[h][w] + 1
                    }
                }
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().split(" ").map { it.toInt() }.run {
        initial = Position1(
            h = get(0),
            w = get(1),
        )
    }

    graph = Array(initial.h) { Array(initial.w) { 0 } }

    repeat(initial.h) {
        readLine().forEachIndexed { index, c ->
            graph[it][index] = c.toString().toInt()
        }
    }

    bfs(Position1(h = 0, w = 0))

    bw.write(graph[initial.h - 1][initial.w - 1].plus(1).toString())

    bw.flush()
    bw.close()
}

private data class Position1(
    val h: Int,
    val w: Int,
)