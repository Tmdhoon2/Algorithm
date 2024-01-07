import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

private val writer = BufferedWriter(OutputStreamWriter(System.out))
private val backTrackingVis = mutableListOf<Int>()
private var btList: MutableList<Int> = mutableListOf()
private var btCount = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        btList = readLine().split(" ").map { it.toInt() }.toMutableList()
        btCount = btList.removeFirst()

        repeat(btCount) {
            backTrackingVis.add(0)
        }

        if (btCount == 0) {
            break
        }

        backTracking(v = mutableListOf())
        writer.write("\n")
    }

    writer.flush()
    writer.close()
}

private fun backTracking(v: MutableList<Int>) {
    if (v.size == 6) {
        val sb = StringBuilder()
        v.forEach {
            sb.append("$it ")
        }
        writer.write("${sb.trim()}\n")
        return
    }
    repeat(btCount) {
        if (backTrackingVis[it] == 0 && (v.lastOrNull() ?: 0) < btList[it]) {
            backTrackingVis[it] = 1
            v.add(btList[it])
            backTracking(v = v)
            backTrackingVis[it] = 0
            v.removeLast()
        }
    }
}