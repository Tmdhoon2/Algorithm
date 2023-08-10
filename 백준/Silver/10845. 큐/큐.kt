import java.io.*
import java.util.*

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val queue = mutableListOf<Int>()

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        when (st.nextToken()) {
            "push" -> queue.add(st.nextToken().toInt())
            "pop" -> {
                if (queue.isNotEmpty()) {
                    val temp = queue.first()
                    queue.removeAt(0)
                    bw.write(temp.toString() + "\n")
                } else {
                    bw.write("-1\n")
                }
            }
            "size" -> bw.write(queue.size.toString() + "\n")
            "empty" -> bw.write(if (queue.isEmpty()) "1\n" else "0\n")
            "front" -> bw.write(if (queue.isNotEmpty()) queue[0].toString() + "\n" else "-1\n")
            "back" -> bw.write(if (queue.isNotEmpty()) queue.last().toString() + "\n" else "-1\n")
        }
    }
    bw.flush()
    bw.close()
}