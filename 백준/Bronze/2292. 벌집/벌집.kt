import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().toInt()
    val list = mutableListOf<Int>()

    var a = 1
    list.add(a)
    var index = 6
    while (a <= input) {
        a += index
        list.add(a)
        index += 6
    }

    for (i in 0 until list.size) {
        if (input <= list[i]) {
            bw.write(i.plus(1).toString())
            break
        }
    }

    bw.flush()
    bw.close()
}