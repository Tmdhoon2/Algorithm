class Solution {
    fun solution(numLog: IntArray): String = StringBuilder().apply {
        repeat(numLog.size - 1) {
            if (numLog[it] + 1 == numLog[it + 1]) append("w")
            else if (numLog[it] - 1 == numLog[it + 1]) append("s")
            else if (numLog[it] + 10 == numLog[it + 1]) append("d")
            else append("a")
        }
    }.toString()
}