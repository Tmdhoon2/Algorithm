class Solution {
    fun solution(num_list: IntArray): Int {
        var a = 1
        num_list.forEach {
            a *= it
        }
        var b = 0
        num_list.forEach {
            b += it
        }
        return if(a < Math.pow(b.toDouble(), 2.0)) 1 else 0
    }
}