import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val count = readLine().toInt()
    val aList = readLine().split(" ").map {
        it.toInt()
    }.sorted()
    val bList = readLine().split(" ").map {
        it.toInt()
    }.sortedDescending()
    var sum = 0
    repeat(count) {
        sum += aList[it] * bList[it]
    }
    bw.write(sum.toString())
    bw.flush()
    bw.close()
}