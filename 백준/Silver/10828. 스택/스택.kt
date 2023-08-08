import java.io.*
import java.util.*

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = mutableListOf<Int>()
    val enter = { bw.write("\n") }
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "push" -> stack.add(st.nextToken().toInt())
            "pop" -> {
                if (stack.isNotEmpty()) {
                    val last = stack[stack.lastIndex]
                    stack.removeAt(stack.lastIndex)
                    bw.write(last.toString())
                } else {
                    bw.write("-1")
                }
                enter()
            }
            "size" -> {
                bw.write(stack.size.toString())
                enter()
            }
            "empty" -> bw.write(if (stack.isEmpty()) "1\n" else "0\n")
            "top" -> {
                if (stack.isNotEmpty()) {
                    bw.write(stack[stack.lastIndex].toString())
                    enter()
                } else bw.write("-1\n")
            }
        }
    }

    bw.flush()
    bw.close()
}