import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = IntArray(10_001)

    val count = readLine().toInt()

    repeat(count){
        list[readLine().toInt()]++
    }

    repeat(list.size){ index ->
        repeat(list[index]){
            bw.write("$index\n")
        }
    }

    bw.flush()
    bw.close()
}