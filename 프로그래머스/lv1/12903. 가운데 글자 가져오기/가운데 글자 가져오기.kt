class Solution {
    fun solution(s: String): String = StringBuilder().apply {
        val length = s.length
        when (length % 2) {
            0 -> append(s[length / 2 - 1]).append(s[length / 2])
            else -> append(s[length / 2])
            
        }
    }.toString()
}