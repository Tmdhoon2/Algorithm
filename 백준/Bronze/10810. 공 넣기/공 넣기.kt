import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())

    val m = st.nextToken()
    val n = st.nextToken()

    val pocket = Array(m.toInt()) { 0 }

    repeat(n.toInt()) {
        st = StringTokenizer(br.readLine())
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        for(z in i..j){
            pocket[z-1] = k
        }
    }

    val sb = StringBuilder()
    pocket.forEach {
        sb.append(it)
        sb.append(" ")
    }

    bw.write(sb.toString().trim())
    bw.flush()
    bw.close()
}