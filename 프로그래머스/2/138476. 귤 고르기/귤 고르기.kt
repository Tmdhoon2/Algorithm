class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var sum = 0
        val array = Array(tangerine.maxOrNull() ?: 0) { 0 }
        tangerine.forEach {
            array[it - 1] += 1
        }
        array.sortedDescending().forEach {
            sum += it
            answer += 1
            if(sum >= k) return answer
        }
        return answer
    }
}