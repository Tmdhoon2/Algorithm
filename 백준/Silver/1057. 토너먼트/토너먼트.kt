import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (size, a, b) = readLine().split(" ").map { it.toDouble() }
    var answer = 1

    val max = maxOf(a, b)
    val min = minOf(a, b)
    a = min
    b = max

   while(true) {
        if (a % 2 == 1.0 && a + 1 == b) {
            break
        }
        a /= 2
        b /= 2
        a = Math.round(a).toDouble()
        b = Math.round(b).toDouble()
        answer++
        //println("$a $b")
    }
    println(answer)
}