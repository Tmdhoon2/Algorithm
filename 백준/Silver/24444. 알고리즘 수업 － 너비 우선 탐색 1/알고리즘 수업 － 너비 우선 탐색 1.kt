import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private var n = 0
private var m = 0
private var r = 0

private lateinit var array: Array<MutableList<Int>>
private lateinit var vis: Array<Int>
private var count = 1
private val queue = ArrayDeque<Int>()

private fun bfs(n: Int) {
    queue.addLast(n)
    vis[n] = count
    count++
    while (queue.size != 0) {
        val v = queue.removeFirst()
        array[v].forEach { i ->
            if (vis[i] == 0) {
                vis[i] = count
                count++
                queue.addLast(i)
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    r = input[2]

    array = Array(n) { mutableListOf() }
    vis = Array(n) { 0 }
    repeat(m) {
        val (x, y) = readLine().split(" ").map { it.toInt() - 1 }
        array[x].add(y)
        array[y].add(x)
    }

    array.forEach {
        it.sort()
    }

    bfs(r - 1)

    vis.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}