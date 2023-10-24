import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var answer = ""
    val list = readLine().split(" ").map { it.toInt() }

    val difference = list[1] - list.first()

    for (i in 2..list.lastIndex) {
        if(list[i] - list[i-1] != difference){
            answer = "mixed"
            break
        }
    }

    if(answer != "mixed"){
        answer = if(difference > 0) "ascending"
        else "descending"
    }

    bw.write(answer)
    bw.flush()
    bw.close()
}