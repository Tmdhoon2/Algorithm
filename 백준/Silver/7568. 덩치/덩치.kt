import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine().toInt()
    val list = mutableListOf<Pair<Int, Int>>()

    repeat(input) {
        val (weight, height) = readLine().split(" ").map { it.toInt() }
        val pair = weight to height
        list.add(pair)
    }

    val mutableList = mutableListOf<Int>()

    for (i in 0 until list.size) {
        var rank = 1
        for (j in 0 until list.size) {
            val first = list[i]
            val second = list[j]
            rank += if (second.first > first.first && second.second > first.second) 1 else 0
        }
        mutableList.add(rank)
    }

    mutableList.forEach { 
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}