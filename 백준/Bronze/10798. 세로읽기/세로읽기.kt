import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<MutableList<Char>>()
    val tempList = mutableListOf<Char>()

    repeat(5){
        val input = br.readLine()
        input.forEach {
            tempList.add(it)
        }
        list.add(tempList.map { it }.toMutableList())
        tempList.clear()
    }

    val sb = StringBuilder()

    repeat(15){index ->
        list.forEach {
            runCatching {
                sb.append(it[index])
            }.onFailure {
                sb.append("")
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}