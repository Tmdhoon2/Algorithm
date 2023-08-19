import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = IntArray(20_000_001)
    val sb = StringBuilder()
    readLine()
    readLine().split(" ").forEach {
        list[it.toInt()+10_000_000]++
    }
    readLine()
    readLine().split(" ").forEach {
        sb.append("${list[it.toInt()+10_000_000]} ")
    }
    bw.write(sb.trim().toString())
    bw.flush()
    bw.close()
}