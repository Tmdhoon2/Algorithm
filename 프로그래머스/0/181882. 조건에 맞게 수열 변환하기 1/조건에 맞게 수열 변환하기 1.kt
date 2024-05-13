class Solution {
    fun solution(arr: IntArray): List<Int> {
        return arr.map { if(it >= 50 && it % 2 == 0) it / 2 else if(it < 50 && it % 2 == 1) it * 2 else it }
    }
}