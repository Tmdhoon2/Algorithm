import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()
    val answer = mutableListOf<Int>()
    repeat(count) {
        answer.add(readLine().toInt())
    }

    val stack = Stack<Int>()
    val sb = StringBuilder()
    var current = 1

    while (true) {
        val first = answer.first()
        if (!stack.contains(first)) {
            stack.push(current)
            current++
            sb.append("+\n")
        } else if (stack.peek() == first) {
            stack.pop()
            answer.removeFirst()
            sb.append("-\n")
        } else {
            break
        }

        if (answer.isEmpty()) {
            break
        }
    }

    if (stack.isEmpty()) {
        bw.write(sb.toString())
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}