import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }

    val sums = mutableListOf<Int>()

    for (i in 0 until count) {
        var sum = 0
        for (j in 0 until count) {
            if (i != j) sum += Math.abs(numbers[i] - numbers[j])
        }
        sums.add(sum)
    }

    val min = sums.minOrNull()!!

    var result = numbers[sums.indexOf(sums.minOrNull()!!)]

    sums.forEachIndexed { index, s ->
        if (s == min) {
            if(numbers[index] <= result) result = numbers[index]
        }
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()
}