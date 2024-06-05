import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    repeat(4) {
        list1.add(readLine().toInt())
    }
    repeat(2) {
        list2.add(readLine().toInt())
    }

    list1.sortDescending()
    list2.sortDescending()

    bw.write("${list1.take(3).sum().plus(list2[0])}")

    bw.flush()
    bw.close()
}