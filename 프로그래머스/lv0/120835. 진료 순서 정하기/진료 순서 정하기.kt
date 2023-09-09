class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val sortedList = emergency.sortedDescending()
        emergency.forEach {
            answer += sortedList.indexOf(it) + 1
        }
        return answer
    }
}