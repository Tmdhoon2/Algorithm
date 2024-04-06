import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val b = readLine()
    var c = StringBuilder()

    for (i in 0 until a.length) {
        c.append(a[i])
        c.append(b[i])
    }

    while (c.length != 2) {
        val d = StringBuilder()
        for (i in 0 until c.lastIndex) {
            d.append((c[i].toString().toInt() + c[i + 1].toString().toInt()) % 10)
        }
        c = d
    }

    if (c.length == 2) {
        bw.write(c.toString())
    } else {
        bw.write("0$c")
    }

    bw.flush()
    bw.close()
}