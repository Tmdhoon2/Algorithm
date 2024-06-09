import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var graph: Array<Array<Int>>
private lateinit var vis: Array<Array<Int>>
private val wList = arrayOf(-1, 0, 1, 0)
private val hList = arrayOf(0, -1, 0, 1)

private var maxW = 0
private var maxH = 0

private var result = 0

private val queue = ArrayDeque<Pair<Int, Int>>()

private fun bfs() {
    while (queue.isNotEmpty()) {
        result++
        repeat(queue.size) {
            val removed = queue.removeFirst()
            graph[removed.first][removed.second] = 1
            repeat(4) {
                val nextH = hList[it] + removed.first
                val nextW = wList[it] + removed.second
                if (nextW in 0 until maxW && nextH in 0 until maxH) {
                    val element = graph[nextH][nextW]
                    val visited = vis[nextH][nextW]
                    if (element == 0 && visited == 0) {
                        queue.addLast(nextH to nextW)
                        vis[nextH][nextW] = 1
                    }
                }
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().split(" ").map { it.toInt() }
    maxW = input[0]
    maxH = input[1]
    graph = Array(maxH) { Array(maxW) { 0 } }
    vis = Array(maxH) { Array(maxW) { 0 } }

    repeat(maxH) { i ->
        val input = readLine().split(" ").map { it.toInt() }
        repeat(maxW) { j ->
            graph[i][j] = input[j]
            if (input[j] == 1) {
                queue.addLast(i to j)
            }
        }
    }

    bfs()

    var printResult = true
    for (i in 0 until maxH) {
        if (graph[i].contains(0)) {
            printResult = false
            bw.write("-1")
            break
        }
    }

    if (printResult) {
        bw.write(result.minus(1).toString())
    }

    bw.flush()
    bw.close()
}