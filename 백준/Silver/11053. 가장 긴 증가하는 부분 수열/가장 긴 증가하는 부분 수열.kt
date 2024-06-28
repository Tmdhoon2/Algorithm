import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()
    val array = readLine().split(" ").map { Data(it.toInt(), 1) }

    array[0].count = 1

    for (i in 0 until array.size) {
        var max = 1
        for (j in 0 until i) {
            if (array[i].number > array[j].number) {
                val sum = array[i].count + array[j].count
                if (sum > max) max = sum
            }
        }
        array[i].count = max
    }

    bw.write(array.toList().maxOfOrNull { it.count }.toString())

    bw.flush()
    bw.close()
}

data class Data(
    var number: Int,
    var count: Int,
)