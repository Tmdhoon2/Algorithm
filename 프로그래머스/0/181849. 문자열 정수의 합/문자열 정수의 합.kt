class Solution {
    fun solution(num_str: String): Int {
        return num_str.toList().map{ Integer.parseInt(it.toString()) }.sum()
    }
}