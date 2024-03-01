import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val map = mutableMapOf<String, String>()
    val (count, goal) = readLine().split(" ").map { it.toInt() }
    repeat(count){
        val (key, value) = readLine().split(" ")
        map[key] = value
    }
    repeat(goal){
        bw.write(map[readLine()]!!)
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}