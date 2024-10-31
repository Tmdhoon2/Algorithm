class Solution {
    fun solution(num_list: IntArray): List<Int> {
        return num_list.toList().sorted().slice(0..4)
    }
}