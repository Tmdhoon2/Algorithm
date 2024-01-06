import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val command = readLine()
        val size = readLine().toInt()
        val list = readLine().run {
            if (this.length >= 3) {
                substring(1 until lastIndex).split(",").toMutableList()
            } else {
                mutableListOf<Int>()
            }
        }

        var reversed = false
        var run = true

        for (i in command.indices) {
            if (!run) {
                break
            }
            when (command[i]) {
                'R' -> {
                    reversed = !reversed
                }

                'D' -> {
                    kotlin.runCatching {
                        if (reversed) {
                            list.removeLast()
                        } else {
                            list.removeFirst()
                        }
                    }.onFailure {
                        run = false
                    }
                }
            }
        }

        if (run) {
            bw.write(list.also { if (reversed) it.reverse() }.toString().replace(" ", ""))
            bw.write("\n")
        } else {
            bw.write("error\n")
        }
    }

    bw.flush()
    bw.close()
}
