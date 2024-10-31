class Solution {
    fun solution(num_list: IntArray): List<Int> {
        return num_list.toList().sorted().slice(5..num_list.size - 1)
    }
}