import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (count, exam) = readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<String, Int>()
    val map2 = mutableMapOf<Int, String>()

    repeat(count) {
        val input = readLine()
        map[input] = it + 1
        map2[it+1] = input
    }

    repeat(exam){
        val input = readLine()
        val result = map.getOrElse(input){
            map2[input.toInt()]
        }
        bw.write("$result\n")
    }

    bw.flush()
    bw.close()
}