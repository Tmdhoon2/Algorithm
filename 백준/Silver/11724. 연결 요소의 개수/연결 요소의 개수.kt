import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var list: Array<MutableList<Int>>
private lateinit var vis: Array<Int>

private fun dfs(n: Int) {
    vis[n] = 1
    list[n].forEachIndexed { index, it ->
        if (vis[it] == 0 && it != 0) {
            list[n][index] = 0
            dfs(it)
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (size, count) = readLine().split(" ").map { it.toInt() }
    list = Array(size + 1) { mutableListOf() }
    vis = Array(size + 1) { 0 }

    repeat(count) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        list[a].add(b)
        list[b].add(a)
    }

    list.forEach {
        it.sort()
    }

    var result = -1
    while (true) {
        var n = 0
        n = vis.indexOf(0)
        if (n != -1) {
            dfs(n = n)
        }
        result++

        if (!vis.contains(0)) {
            break
        }
    }

    bw.write(result.toString())

    bw.flush()
    bw.close()
}