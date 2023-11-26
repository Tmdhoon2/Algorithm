import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayDeque

val dfsGraph = Array(1001) { Array(1001) { 0 } }
val dfsVis = Array(1001) { 0 }
val bfsGraph = Array(1001) { Array(1001) { 0 } }
val bfsVis = Array(1001) { 0 }
val queue = ArrayDeque<Int>()

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun dfs(v: Int, n: Int) {
    bw.write("$v ")
    for (i in 1..n) {
        if (dfsVis[i] != 1 && dfsGraph[v][i] == 1) {
            dfsVis[i] = 1
            dfs(i, n)
        }
    }
}

fun bfs(first: Int, n: Int) {
    queue.addLast(first)
    bfsVis[first] = 1
    while (queue.size != 0) {
        val v = queue.removeFirst()
        bw.write("$v ")
        for (i in 1..n) {
            if (bfsVis[i] == 0 && bfsGraph[v][i] == 1) {
                bfsVis[i] = 1
                queue.addLast(i)
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val v = st.nextToken().toInt()

    dfsVis[v] = 1

    repeat(m) {
        val st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        dfsGraph[a][b] = 1
        dfsGraph[b][a] = 1
        bfsGraph[a][b] = 1
        bfsGraph[b][a] = 1
    }

    dfs(v, n)
    bw.write("\n")
    bfs(v, n)

    bw.flush()
    bw.close()
}