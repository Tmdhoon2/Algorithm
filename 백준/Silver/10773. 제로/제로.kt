import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Int>()

    repeat(readLine().toInt()) {
        val input = readLine().toInt()
        if (stack.isEmpty() && input != 0) {
            stack.push(input)
        } else {
            if (input == 0) {
                stack.pop()
            } else {
                stack.push(input)
            }
        }
    }

    bw.write(stack.sum().toString())

    bw.flush()
    bw.close()
}