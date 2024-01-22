import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val map = mutableMapOf<String, String>()
    repeat(readLine().toInt()){
        val (key, value) = readLine().split(" ")
        when(value){
            "enter" -> map[key] = value
            else -> map.remove(key)
        }
    }
    map.keys.sortedDescending().forEach(::println)
}