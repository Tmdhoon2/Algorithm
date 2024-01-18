import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var answer = 0
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = listOf(
        "c=",
        "c-",
        "dz=",
        "d-",
        "lj",
        "nj",
        "s=",
        "z="
    )

    var input = readLine()

    for(i in 0 until list.size){
        while(input.contains(list[i])){
            input = input.replaceFirst(list[i], "0")
            answer += 1
        }
    }

    answer += input.count { it != '0' }

    bw.write("$answer")
    bw.flush()
    bw.close()
}