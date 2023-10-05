class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if (a % 2 == 1 && b % 2 == 1) {
            answer = (Math.pow(a.toDouble(), 2.0) + Math.pow(b.toDouble(), 2.0)).toInt()
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer += (a + b) * 2
        } else {
            answer += Math.abs(a - b)
        }
        return answer
    }
}