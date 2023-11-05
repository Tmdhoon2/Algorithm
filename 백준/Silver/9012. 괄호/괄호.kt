import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()

    val list = mutableListOf<String>()
    val answer = mutableListOf<String>()

    repeat(count) {
        list.add(readLine())
    }

    list.forEach {
        val stack = Stack<Char>()
        var result = "YES"
        for (i in 0 until it.length) {
            when(it[i]){
                '(' -> {
                    stack.push(it[i])
                }
                ')' -> {
                    if(stack.isEmpty()){
                        result = "NO"
                        break
                    }
                    stack.pop()
                }
            }
        }
        if(stack.isNotEmpty()) result = "NO"
        answer.add(result)
    }

    val sb = StringBuilder()
    answer.forEach {
        sb.append("${it} ")
    }

    val result = sb.toString().trim().replace(" ", "\n")

    bw.write(result)
    bw.flush()
    bw.close()
}