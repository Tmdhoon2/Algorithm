import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val xList = listOf(0, 0, -1, 1)
private val yList = listOf(-1, 1, 0, 0)

private lateinit var array: Array<Array<Char>>
private var x: Int = 0
private var y: Int = 0

private var result: Int = 0

private fun dfs(positionX: Int, positionY: Int) {
    for (it in 0..3) {
        val currentX = positionX + xList[it]
        val currentY = positionY + yList[it]

        /*array.forEach {
            println(it.toList())
        }

        println()*/

        if (currentX in 0..x - 1 && currentY in 0..y - 1 && array[currentY][currentX] != 'X') {
            val element = array[currentY][currentX]
            when (element) {
                'O' -> {
                    array[currentY][currentX] = 'X'
                    dfs(currentX, currentY)
                }

                'P' -> {
                    array[currentY][currentX] = 'O'
                    dfs(currentX, currentY)
                    result++
                }
            }
        }
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine().split(" ").map { it.toInt() }
    y = input[0]
    x = input[1]
    var xI = 0
    var yI = 0
    array = Array(y) { Array(x) { 'O' } }


    repeat(y) {
        readLine().forEachIndexed { index, c ->
            array[it][index] = c
            if (c == 'I') {
                yI = it
                xI = index
            }
        }
    }

    dfs(xI, yI)

    bw.write(if (result == 0) "TT" else result.toString())
    bw.flush()
    bw.close()
}