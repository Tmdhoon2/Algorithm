import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var vis: Array<Int>
private lateinit var array: Array<Int>
private var M = 0
private val list = mutableListOf<List<Int>>()

private fun dfs(n: Int) {
    if (n == vis.size) {
        val result1 = array.filterIndexed { index, i -> vis[index] == 1 }.sorted()
        if (result1.size == M && !list.contains(result1)) {
            list.add(result1)
        }
    } else {
        vis[n] = 1
        dfs(n + 1)
        vis[n] = 0
        dfs(n + 1)
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    M = m
    array = (1..n).toList().toTypedArray()
    vis = Array(n) { 0 }

    dfs(n = 0)
    list.forEach {
        bw.write(it.toString().replace("[", "").replace("]", "").replace(",", ""))
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}