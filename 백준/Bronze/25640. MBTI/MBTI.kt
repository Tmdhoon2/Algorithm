import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val mbti = readLine()
    var answer = 0
    repeat(readLine().toInt()) {
        if (readLine() == mbti) {
            answer++
        }
    }

    println(answer)
}