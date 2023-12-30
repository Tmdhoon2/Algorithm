class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()

        commands.forEach {
            val start = it[0]
            val end = it[1]
            val index = it[2]
            answer += (start..end).map { array[it-1] }.toList().sorted()[index-1]
        }

        return answer
    }
}