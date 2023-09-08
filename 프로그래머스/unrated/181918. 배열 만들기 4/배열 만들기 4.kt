class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk = mutableListOf<Int>()
        var i = 0
        while (i < arr.size) {
            if (stk.isEmpty()) {
                stk += arr[i]
                i += 1
            } else if (stk.last() < arr[i]) {
                stk += arr[i]
                i += 1
            } else {
                stk.removeLast()
            }
        }
        return stk.toIntArray()
    }
}