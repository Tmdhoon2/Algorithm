import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (count, goal) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    var result = 0
    repeat(count) {
        list.add(readLine().toInt())
    }

    list.sortedDescending().run {
        forEach {
            if(it <= goal) {
                result += goal / it
                goal %= it
            }
        }
    }

    bw.write(result.toString())

    bw.flush()
    bw.close()
}