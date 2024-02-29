import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private var size = 0
private lateinit var array: Array<Array<Int>>
private lateinit var vis: Array<Array<Int>>
private var count = 0
private val results = mutableListOf<Int>()
private val xList = listOf(0, 1, 0, -1)
private val yList = listOf(-1, 0, 1, 0)

private fun dfs(x: Int, y: Int) {
    vis[y][x] = 1
    count++
    repeat(4) {
        val currentX = x + xList[it]
        val currentY = y + yList[it]
        if (currentX in 0..size - 1 && currentY in 0..size - 1) {
            val element = array[currentY][currentX]
            if(vis[currentY][currentX] == 0 && element == 1){
                dfs(currentX, currentY)
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    size = readLine().toInt()
    array = Array(size) { Array(size) { 0 } }
    vis = Array(size) { Array(size) { 0 } }

    repeat(size) {
        readLine().map { Integer.parseInt(it.toString()) }.forEachIndexed { index, i ->
            array[it][index] = i
        }
    }

    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            if (vis[i][j] == 0 && array[i][j] == 1) {
                dfs(j, i)
                results.add(count)
                count = 0
            }
        }
    }

    bw.write("${results.size}\n")
    results.sorted().forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}