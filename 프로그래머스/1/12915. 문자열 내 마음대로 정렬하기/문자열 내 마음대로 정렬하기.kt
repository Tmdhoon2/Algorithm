class Solution {
    fun solution(strings: Array<String>, n: Int) = strings.sorted().sortedBy { it[n] }
}