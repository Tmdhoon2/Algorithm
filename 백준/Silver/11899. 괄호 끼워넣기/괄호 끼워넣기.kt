import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var answer = 0
    val input = readLine().toMutableList()
    val stack = Stack<Char>()

    while (input.isNotEmpty()) {
        val first = input.first()

        if (stack.isEmpty()) {
            stack.push(first)
            input.removeFirst()
        } else {
            when (first) {
                ')' -> {
                    if (stack.peek() == '(') {
                        stack.pop()
                        input.removeFirst()
                    } else {
                        stack.push(first)
                        input.removeFirst()
                    }
                }

                '(' -> {
                    stack.push(first)
                    input.removeFirst()
                }
            }
        }
    }

    answer = stack.size

    with(bw) {
        write(answer.toString())
        flush()
        close()
    }
}