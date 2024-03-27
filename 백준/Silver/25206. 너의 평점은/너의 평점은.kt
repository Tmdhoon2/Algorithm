import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = mutableListOf<Double>()

    val map = mutableMapOf<String, Double>()
    val ranks = listOf(
        "A+",
        "A0",
        "B+",
        "B0",
        "C+",
        "C0",
        "D+",
        "D0",
        "F",
    )

    var sum = 4.5
    ranks.forEach {
        if (it == "F") {
            map[it] = 0.0
        } else {
            map[it] = sum
            sum -= 0.5
        }
    }

    var scoreSum = 0.0

    repeat(20) {
        val (name, score, rank) = readLine().split(" ")
        if (rank != "P") {
            scoreSum += score.toDouble()
            val result = score.toDouble() * map[rank]!!
            list.add(result)
        }
    }

    bw.write("${list.sum() / scoreSum}")

    bw.flush()
    bw.close()
}