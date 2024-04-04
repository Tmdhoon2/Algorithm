import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var vis: Array<Int>
private lateinit var array: Array<MutableList<Int>>
private val queue = ArrayDeque<Int>()
private var count = 1

private fun bfs(n: Int) {
    queue.addLast(n)
    vis[n] = count
    count++
    while (queue.size != 0) {
        val v = queue.removeFirst()
        array[v].forEach {
            if(vis[it] == 0) {
                vis[it] = count
                count++
                queue.addLast(it)
            }
        }
    }

}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().split(" ").map { it.toInt() }
    val size = input[0]
    val count = input[1]

    vis = Array(size) { 0 }
    array = Array(size) { mutableListOf() }

    repeat(count) {
        val (x, y) = readLine().split(" ").map { it.toInt() - 1 }
        array[x].add(y)
        array[y].add(x)
    }

    array.forEach {
        it.sortDescending()
    }

    bfs(input[2] - 1)

    vis.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}