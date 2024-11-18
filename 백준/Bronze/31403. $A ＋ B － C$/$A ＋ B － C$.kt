import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    println(a + b - c)
    println("$a$b".toLong() - c)
}