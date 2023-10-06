import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val primeNumbers = getPrimeNumbers(7500000)

    bw.write(primeNumbers[readLine().toInt() - 1].toString())

    bw.flush()
    bw.close()
}

fun getPrimeNumbers(n: Int): List<Int> {
    val array = Array(n + 1) { 0 }

    array[0] = 1
    array[1] = 1

    val end = Math.sqrt(n.toDouble()).toInt()

    for (i in 2..end) {
        if (array[i] == 0) {
            for (j in i * 2..n step i) {
                array[j] = 1
            }
        }
    }

    val returnList = mutableListOf<Int>()

    array.forEachIndexed { index, i ->
        if (i == 0) {
            returnList.add(index)
        }
    }

    return returnList
}