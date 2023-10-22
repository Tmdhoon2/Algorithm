import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var answer = "Nice"
    val count = readLine().toInt()
    val input = readLine().split(" ").map { it.toInt() }.toMutableList()

    val stack = Stack<Int>()

    var min = input.minOrNull()!!

    while (input.isNotEmpty()) {
        val first = input.first()

        if (first == min) {
            input.removeFirst()
            min += 1
        } else if (stack.isEmpty()) {
            stack.push(first)
            input.removeFirst()
        } else {
            if (stack.peek() == min) {
                stack.pop()
                min += 1
            } else {
                stack.push(first)
                input.removeFirst()
            }
        }
    }

    while(stack.isNotEmpty()){
        if(stack.pop() != min){
            answer = "Sad"
            break
        } else{
            min += 1
        }
    }

    with(bw) {
        write(answer)
        flush()
        close()
    }
}