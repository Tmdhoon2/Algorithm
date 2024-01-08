import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (size, step) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    repeat(size) {
        list.add(it + 1)
    }

    var index = -1
    var count = 0

    val answer = mutableListOf<Int>()

    while (answer.size < size) {
        count++
        index++
        if(index > size - 1){
            index %= size
        }
        while(answer.contains(list[index])){
            index++
            if(index > size - 1){
                index %= size
            }
        }
        if (count == step) {
            count = 0
            answer.add(list[index])
        }
    }

    bw.write(answer.toString().replace('[', '<').replace(']', '>'))

    bw.flush()
    bw.close()
}