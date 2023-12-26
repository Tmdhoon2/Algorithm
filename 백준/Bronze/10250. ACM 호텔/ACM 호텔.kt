import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()

    repeat(count) {
        val (height, width, number) = readLine().split(" ").map { it.toInt() }
        var currentHeight = 0
        var currentWidth = 1

        for(i in 1..number){
            if(currentHeight < height){
                currentHeight++
            } else {
                currentHeight = 1
                currentWidth++
            }
        }
        bw.write("${currentHeight * 100 + currentWidth}\n")
    }

    bw.flush()
    bw.close()
}