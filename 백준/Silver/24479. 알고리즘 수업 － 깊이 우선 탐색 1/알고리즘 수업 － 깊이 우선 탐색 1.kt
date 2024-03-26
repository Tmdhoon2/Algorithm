import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var array: Array<MutableList<Int>>
private lateinit var vis: MutableList<Int>
private var start = 0
private var count = 1

private fun dfs(n: Int) {
    vis[n] = count
    count++
    array[n].map { it - 1 }.forEach {
        if (vis[it] == 0) {
            vis[it] = 1
            dfs(n = it)
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, r) = readLine().split(" ").map { it.toInt() }

    start = r - 1

    array = Array(n) { mutableListOf() }
    vis = mutableListOf()

    repeat(m) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        array[x - 1].add(y)
        array[y - 1].add(x)
    }

    array.forEach {
        it.sort()
    }

    repeat(n) {
        vis.add(0)
    }

    vis[r - 1] = 1
    dfs(n = r - 1)

    vis.forEach { 
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}