import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val count = readLine().toInt()

    val set = mutableSetOf<Int>()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(count) {
        val input2 = readLine().split(" ")
        val command = input2.first()
        val input = if(input2.size == 1) 0 else input2[1].toInt()
        when (command) {
            "add" -> {
                set.add(input)
            }

            "check" -> {
                bw.write(if(set.contains(input)) "1\n" else "0\n")
            }

            "remove" -> {
                set.remove(input)
            }

            "toggle" -> {
                if(set.contains(input)) set.remove(input)
                else set.add(input)
            }

            "all" -> {
                set.clear()
                set.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20))
            }

            "empty" -> {
                set.clear()
            }
        }
    }

    bw.flush()
    bw.close()
}