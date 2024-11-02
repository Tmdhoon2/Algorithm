import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    println(a * b)
}