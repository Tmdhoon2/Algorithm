import java.io.*
import java.util.*

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Int>()
    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val command = st.nextToken()
        when (command) {
            "push_front" -> list.add(0, st.nextToken().toInt())
            "push_back" -> {
                if (list.isNotEmpty()) {
                    list.add(st.nextToken().toInt())
                } else list.add(st.nextToken().toInt())
            }

            "pop_front" -> {
                if (list.isNotEmpty()) {
                    bw.write(list[0].toString() + "\n")
                    list.removeAt(0)
                } else bw.write("-1\n")
            }

            "pop_back" -> {
                if (list.isNotEmpty()) {
                    bw.write(list[list.lastIndex].toString() + "\n")
                    list.removeAt(list.lastIndex)
                } else bw.write("-1\n")
            }

            "size" -> bw.write(list.size.toString() + "\n")
            "empty" -> bw.write(if (list.isEmpty()) "1\n" else "0\n")
            "front" -> bw.write(if (list.isNotEmpty()) list[0].toString() + "\n" else "-1\n")
            else -> bw.write(if (list.isNotEmpty()) list[list.lastIndex].toString() + "\n" else "-1\n")
        }
    }

    bw.flush()
    bw.close()
}