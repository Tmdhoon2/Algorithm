import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()

    var st = StringTokenizer(br.readLine())

    val n = st.nextToken()
    val m = st.nextToken()

    val basket = Array(n.toInt()) { it+1 }

    repeat(m.toInt()){
        st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()

        val temp = basket[i-1]
        basket[i-1] = basket[j-1]
        basket[j-1] = temp
    }

    basket.forEach {
        sb.append(it)
        sb.append(" ")
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()
}