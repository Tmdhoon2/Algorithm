import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").toMutableList()
    val result = StringBuilder()
    input.forEachIndexed { index, s ->
        if (s.contains("What")) {
            result.append("$s ")
        } else {
            if (s.contains("?")) {
                result.append("$s ")
                if (result.contains("What")) {
                    println(result.toString().replace("What", "Forty-two").replace("?", ".").trim())
                    result.clear()
                } else {
                    result.clear()
                }
            } else {
                if (s.contains(".")) {
                    result.clear()
                } else {
                    result.append("$s ")
                }
            }
        }
    }
}
