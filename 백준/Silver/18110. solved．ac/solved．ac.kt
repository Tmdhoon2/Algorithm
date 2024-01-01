import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Int>()
    val count = readLine().toInt()
    repeat(count) {
        list.add(readLine().toInt())
    }
    list.sort()
    val percentage = Math.round(count * 0.15).toInt()
    list.subList(percentage, count - percentage).let {
        bw.write(Math.round(it.average()).toString())
    }

    bw.flush()
    bw.close()
}