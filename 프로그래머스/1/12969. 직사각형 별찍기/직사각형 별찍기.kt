import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    repeat(b){
        repeat(a){
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}