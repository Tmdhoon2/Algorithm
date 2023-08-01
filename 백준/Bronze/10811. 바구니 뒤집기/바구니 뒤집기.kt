import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val basket = Array(n) { it + 1 }

    repeat(m) {
        st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()
        val subList = basket.toList().subList(i - 1, j)

        var index = subList.size-1

        for (z in i - 1 until j) {
            basket[z] = subList[index]
            index -= 1
        }
    }

    basket.forEach {
        sb.append(it)
        sb.append(" ")
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()
}