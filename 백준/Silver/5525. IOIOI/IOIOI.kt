import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine().toInt()
    val input = readLine()

    val string = getString(n)
    var result = 0
    /*println(string)
    println()*/

    repeat(s - string.length + 1) {
        /*println(input.substring(it..it + string.length - 1))*/
        if(input.substring(it..it + string.length - 1) == string) result++
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()
}

private fun getString(length: Int): String {
    val sb = StringBuilder()
    repeat(length * 2 + 1) {
        sb.append(
            when (it % 2) {
                0 -> "I"
                else -> "O"
            }
        )
    }

    return sb.toString()
}