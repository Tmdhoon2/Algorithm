class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        repeat(a.size){
            answer += a[it] * b[it]
        }
        return answer
    }
}