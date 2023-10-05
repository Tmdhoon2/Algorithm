class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        my_string.forEach {
            runCatching {
                answer += it.toString().toInt()
            }.onFailure {
                
            }
        }
        return answer
    }
}