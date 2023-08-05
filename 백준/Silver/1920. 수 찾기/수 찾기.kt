import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(): Unit = with(BufferedReader(InputStreamReader(System.`in`))){

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().toInt()
    val nSet = mutableSetOf<String>()

    nSet.addAll(readLine().split(" "))

    readLine().toInt()
    val mList = readLine().split(" ")

    mList.forEach {
        bw.write(if(nSet.contains(it)) 1.toString() else 0.toString())
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}