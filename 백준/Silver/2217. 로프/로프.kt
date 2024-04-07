import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().toInt()
    val list = mutableListOf<Int>()
    val set = mutableSetOf<Int>()

    repeat(input) {
        list.add(readLine().toInt())

    }
    list.sort()
    list.forEachIndexed { index, i ->
        set.add(i * (input - index))
    }

    bw.write(set.maxOrNull()!!.toString())

    bw.flush()
    bw.close()
}