import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().toInt()

    val dpTable = Array(1001) { 0 }

    dpTable[1] = 1
    dpTable[2] = 3

    if (input >= 3) {
        for(i in 3..input){
            dpTable[i] = (dpTable[i-2] * 2 + dpTable[i-1]) % 10007
        }
    }

    bw.write(dpTable[input].toString())
    bw.flush()
    bw.close()
}