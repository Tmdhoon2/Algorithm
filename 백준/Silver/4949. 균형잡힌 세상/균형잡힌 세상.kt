import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()
        val sb = StringBuilder()

        if (input == ".") {
            break
        } else {
            input.forEach {
                if (it == '[' || it == ']' || it == '(' || it == ')') {
                    sb.append(it)
                }
            }
            val stack = Stack<Char>()
            repeat(sb.length) {
                if (stack.isEmpty()) {
                    stack.push(sb[it])
                } else {
                    if (stack.peek() == '(' && sb[it] == ')') {
                        stack.pop()
                    } else if (stack.peek() == '[' && sb[it] == ']') {
                        stack.pop()
                    } else {
                        stack.push(sb[it])
                    }
                }
            }
            if (stack.isEmpty()) {
                bw.write("yes\n")
            } else {
                bw.write("no\n")
            }
        }
    }

    bw.flush()
    bw.close()
}