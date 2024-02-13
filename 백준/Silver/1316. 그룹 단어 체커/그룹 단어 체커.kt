import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var count = 0

    repeat(readLine().toInt()) {
        val input = readLine()
        if (getBoolean(input = input)) {
            count++
        }
    }

    bw.write(count.toString())
    bw.flush()
    bw.close()
}

fun getBoolean(
    input: String,
): Boolean {
    val list = mutableListOf<Char>()

    for(i in 'a'..'z'){
        list.add(i)
    }

    if (input.length != 1) {
        for (i in 0 until input.lastIndex) {
            if (input[i] != input[i + 1]) {
                if (list.contains(input[i])) {
                    list.remove(input[i])
                } else {
                    return false
                }
            }
        }
    } else {
        return true
    }

    return list.contains(input.lastOrNull()!!)
}