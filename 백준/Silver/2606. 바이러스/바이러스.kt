import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val graph = mutableListOf<MutableList<Int>>()
val vis = mutableListOf<Int>()
var count = -1

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().toInt().run {
        repeat(this) {
            vis.add(0)
            val list = mutableListOf<Int>()
            repeat(this) {
                list.add(0)
            }
            graph.add(list)
        }
    }

    repeat(readLine().toInt()) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        graph[a - 1][b - 1] = 1
        graph[b - 1][a - 1] = 1
    }

    vis[0] = 1
    dfs2(0)

    bw.write("$count")
    bw.flush()
    bw.close()
}

fun dfs2(v: Int) {
    count += 1
    for (i in 0..graph.size - 1) {
        if (vis[i] == 0 && graph[v][i] == 1) {
            vis[i] = 1
            dfs2(i)
        }
    }
}