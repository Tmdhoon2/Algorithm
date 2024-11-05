class Solution {
    fun solution(arr: IntArray, n: Int): List<Int> {
        return arr.mapIndexed { index, element ->
            when(arr.size % 2) {
                0 -> {
                    if (index % 2 == 1) element + n
                    else element
                }
                else -> {
                    if (index % 2 == 0) element + n
                    else element
                }
            }
        }
    }
}