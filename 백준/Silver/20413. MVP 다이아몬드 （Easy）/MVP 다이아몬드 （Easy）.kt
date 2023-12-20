import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val rankMap = mutableMapOf<Char, Int>()

    val ranks = listOf('B', 'S', 'G', 'P', 'D')
    val count = readLine().toInt()
    val inputs = readLine().split(" ")

    inputs.forEachIndexed { index, c ->
        rankMap[ranks[index]] = Integer.parseInt(c) - 1
    }

    val answers = mutableListOf<Int>()

    val input = readLine()
        answers.add(rankMap[input.first()] ?: inputs.last().toInt())

    for (i in 1 until count) {
        val rankMax = rankMap[input[i]] ?: ((inputs.last().toInt()) + answers[i - 1])
        answers.add(rankMax - answers[i - 1])
    }

    bw.write(answers.sum().toString())

    bw.flush()
    bw.close()
}