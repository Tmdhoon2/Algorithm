import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val results = mutableListOf<Char>()

    repeat(readLine().toInt()) {
        val inputA = readLine().split(" ").map { it.toInt() }.toMutableList()
        val inputB = readLine().split(" ").map { it.toInt() }.toMutableList()
        inputA.removeFirst()
        inputB.removeFirst()

        for (i in 4 downTo 1) {
            val countA = inputA.count { it == i }
            val countB = inputB.count { it == i }
            if (countA > countB) {
                results.add('A')
                break
            } else if (countB > countA) {
                results.add('B')
                break
            } else {
                if (i == 1) {
                    results.add('D')
                }
            }
        }
    }

    results.forEach {
        bw.write(it.toString())
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}