import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw1 = BufferedWriter(OutputStreamWriter(System.out))
val btVis = Array(9) { false }
var m = 0
var n = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val input = readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    bt(v = "")

    bw1.flush()
    bw1.close()
}

fun bt(v: String) {
    if (v.length == m) {
        val sb = StringBuilder()
        v.forEach {
            sb.append(it)
            sb.append(" ")
        }
        bw1.write("${sb.trim()}\n")
        return
    }

    repeat(n) {
        if (!btVis[it + 1]) {
            btVis[it + 1] = true
            bt(v = v.plus(it + 1))
            btVis[it + 1] = false
        }
    }
}