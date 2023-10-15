import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = Array(9) { 0 }

    repeat(9) {
        list.set(it, readLine().toInt())
    }

    for (i in 0 until list.lastIndex) {
        for (j in i + 1 until list.size) {
            val tempI = list[i]
            val tempJ = list[j]

            val result = runCatching {
                list[i] = 0
                list[j] = 0
                //println(list.toList())
            }

            if (result.isSuccess && list.sum() == 100) {
                break
            } else {
                list[i] = tempI
                list[j] = tempJ
            }
        }
        if(list.sum() == 100) break
    }

    list.sort()

    list.forEach {
        if(it != 0) bw.write("${it}\n")
    }

    bw.flush()
    bw.close()
}