class Solution {
    private val array = Array(100001) { 0 }
    fun solution(n: Int): Int {
        array[0] = 1
        array[1] = 1
        for (i in 2..n) {
            array[i] = (array[i - 1] + array[i - 2]) % 1234567
        }
        return array[n - 1]
    }
}