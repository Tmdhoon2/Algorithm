import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (i, j) = readLine().split(" ").map { it.toInt() }

    val array = Array(i) { Array(j) { '.' } }
    val resultArray = Array(i) { Array(j) { 0 } }

    for (y in 0 until i) {
        readLine().forEachIndexed { index, c ->
            array[y][index] = c
        }
    }

    for (y in 0 until i) {
        var cloud = -1
        for (x in 0 until j) {
            if (array[y][x] == 'c') cloud = 0
            else {
                if (cloud >= 0) cloud++
            }
            resultArray[y][x] = cloud
        }
    }

    resultArray.forEach {
        bw.write(it.toList().toString().replace("[", "").replace("]", "").replace(",", ""))
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}