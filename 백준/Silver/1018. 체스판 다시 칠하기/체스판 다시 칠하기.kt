import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (x, y) = readLine().split(" ").map { it.toInt() }
    val array = Array(x) { Array(y) { 0 } }

    repeat(x) {
        readLine().forEachIndexed { index, c ->
            array[it][index] = when (c) {
                'W' -> 0
                else -> 1
            }
        }
    }

    val result = mutableListOf<Int>()

    repeat(x - 7) { i ->
        val rangeX = i..7 + i
        repeat(y - 7) { j ->
            val rangeY = j..7 + j
            val current = array.slice(rangeX).map { it.slice(rangeY) }
            val count = getCount(current)
            result.add(count)
        }
    }

    bw.write(result.minOrNull()!!.toString())
    bw.flush()
    bw.close()
}

private fun getCount(array: List<List<Int>>): Int {
    var first = array[0][0]
    var firstWrong = 0
    var secondWrong = 0
    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            when (first) {
                0 -> if ((i + j) % 2 != array[i][j]) {
                    firstWrong++
                }

                1 -> if ((i + j) % 2 == array[i][j]) {
                    firstWrong++
                }
            }
        }
    }

    first = if(first == 1) 0 else 1

    for (i in 0 until array.size) {
        for (j in 0 until array[i].size) {
            when (first) {
                0 -> if ((i + j) % 2 != array[i][j]) {
                    secondWrong++
                }

                1 -> if ((i + j) % 2 == array[i][j]) {
                    secondWrong++
                }
            }
        }
    }

    return minOf(firstWrong, secondWrong)
}