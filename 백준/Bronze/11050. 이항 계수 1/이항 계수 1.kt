import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    if(k == 0 || n == k){
        bw.write("1")
    }
    else if (n != k) {
        var N = n
        var K = k
        var R = n - k

        for (i in n - 1 downTo 1) {
            N *= i
        }

        for (i in k - 1 downTo 1) {
            K *= i
        }


        for (i in n - k - 1 downTo 1) {
            R *= i
        }

        bw.write((N / (K * R)).toString())
    }
    bw.flush()
    bw.close()
}