import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var initial: Position
private lateinit var array: Array<Array<Int>>
private lateinit var vis: Array<Array<Int>>

private val queue: ArrayDeque<Position> = ArrayDeque()
private val hList = listOf(-1, 0, 1, 0)
private val wList = listOf(0, 1, 0, -1)

private fun bfs(position: Position) {
    queue.addLast(position)

    while (queue.isNotEmpty()) {
        val removed = queue.removeFirst()
        array[removed.h][removed.w] = 0
        vis[removed.h][removed.w] = 1

        for (i in 0..3) {
            val nextH = removed.h + hList[i]
            val nextW = removed.w + wList[i]
            if (nextH in 0 until initial.h && nextW in 0 until initial.w) {
                if (array[nextH][nextW] == 1 && vis[nextH][nextW] == 0) {
                    queue.addLast(
                        Position(
                            h = nextH,
                            w = nextW,
                        ),
                    )
                    vis[nextH][nextW] = 1
                }
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (w, h, count) = readLine().split(" ").map { it.toInt() }
        array = Array(h) { Array(w) { 0 } }
        vis = Array(h) { Array(w) { 0 } }
        initial = Position(
            h = h,
            w = w,
        )

        repeat(count) {
            val input = readLine().split(" ").map { it.toInt() }
            array[input[1]][input[0]] = 1
        }

        var result = 0

        for (h in 0 until h) {
            for (w in 0 until w) {
                if (array[h][w] == 1) {
                    result++
                    bfs(
                        position = Position(
                            h = h,
                            w = w,
                        ),
                    )
                }
            }
        }

        bw.write(result.toString())
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}

private data class Position(
    val h: Int,
    val w: Int,
)