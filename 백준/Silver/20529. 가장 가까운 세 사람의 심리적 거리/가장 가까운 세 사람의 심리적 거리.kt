import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val count = readLine().toInt()

    repeat(count) {
        readLine()
        val input = getList(readLine().split(" ").sorted())
        val size = input.size
        val array = Array(size) { "" }
        if (size >= 3) {
            input.forEachIndexed { index, c ->
                array[index] = c
            }
            var distance =
                getDistance(array[0], array[1]) + getDistance(array[1], array[2]) + getDistance(array[0], array[2])

            for (i in 0 until size - 2) {
                for (j in i + 1 until size - 1) {
                    for (k in j + 1 until size) {
                        val result = getDistance(array[i], array[j]) +
                                getDistance(array[j], array[k]) +
                                getDistance(array[i], array[k])
                        if (result < distance) distance = result
                    }
                }
            }
            bw.write("$distance\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.flush()
    bw.close()
}

private fun getDistance(
    mbti1: String,
    mbti2: String,
): Int {
    var distance = 0
    repeat(4) {
        if (mbti1[it] != mbti2[it]) distance++
    }

    return distance
}

private fun getList(list: List<String>): List<String> {
    val set = list.toSet()
    val mutableList = mutableListOf<String>()
    set.forEach { mbti ->
        val count = list.count { mbti == it }
        repeat(if (count > 3) 3 else count) {
            mutableList.add(mbti)
        }
    }

    return mutableList
}