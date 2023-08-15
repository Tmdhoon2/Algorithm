import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    val list = mutableListOf<Int>()
    readLine()
    readLine().split(" ").toSet().forEach {
        list.add(it.toInt())

    }
    list.sorted().forEach {
        sb.append("$it ")
    }
    bw.write(sb.trim().toString())
    bw.flush()
    bw.close()
}