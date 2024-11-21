import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        val input = readLine().split(" ")
        var num = input.first().toDouble()
        for(i in 1..input.lastIndex) {
            when (input[i]) {
                "@" -> {
                    num *= 3
                }
                "%" -> {
                    num += 5
                }
                "#" -> {
                    num -= 7
                }
            }
        }
        println(String.format("%.2f", num))
    }
}