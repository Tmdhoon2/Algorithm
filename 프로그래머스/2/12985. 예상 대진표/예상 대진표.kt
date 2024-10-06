class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var A = a
        var B = b

        while (Math.abs(A - B) != 1 || minOf(A, B) % 2 != 1) {
            answer += 1
            A = Math.round(A / 2.0).toInt()
            B = Math.round(B / 2.0).toInt()
        }

        return answer
    }
}