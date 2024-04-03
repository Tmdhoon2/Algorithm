import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private lateinit var array: Array<MutableList<Int>>
private lateinit var vis: Array<Int>

private var count = 1

private fun dfs(n: Int) {
    vis[n] = count
    count++
    array[n].forEach { i ->
        if (vis[i] == 0) {
            dfs(i)
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().split(" ").map { it.toInt() }
    val size = input[0]

    array = Array(size) { mutableListOf() }
    vis = Array(size) { 0 }

    repeat(input[1]) {
        val (x, y) = readLine().split(" ").map { it.toInt() - 1 }
        array[x].add(y)
        array[y].add(x)
    }

    array.forEach {
        it.sortDescending()
    }

    dfs(input[2] - 1)

    vis.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}