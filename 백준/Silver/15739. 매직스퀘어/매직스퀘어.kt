import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val sum = n * (n * n + 1) / 2
    val array = mutableListOf<List<Int>>()
    repeat(n) {
        val input = readLine().split(" ").map { it.toInt() }
        array.add(input)
    }

    array.forEach {
        if (it.sum() != sum) {
            bw.write("FALSE")
            bw.flush()
            return@with
        } else if (it.toSet().size != n) {
            bw.write("FALSE")
            bw.flush()
            return@with
        }
    }

    var temp = 0
    repeat(n) {
        temp += array[it][it]
    }

    if (temp != sum) {
        bw.write("FALSE")
        bw.flush()
        return@with
    }
    temp = 0
    repeat(n) {
        temp += array[it][n - 1 - it]
    }

    if (temp != sum) {
        bw.write("FALSE")
        bw.flush()
        return@with
    }

    bw.write("TRUE")
    bw.flush()
    bw.close()
}