class Solution {
    fun solution(str1: String, str2: String): Int {
        return if(str2.contains(str1)) 1 else 0
    }
} // 프로그래머스 - 부분 문자열