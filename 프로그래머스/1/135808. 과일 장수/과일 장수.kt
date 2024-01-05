class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sort()
        repeat(score.size / m) {
            if (score.size >= m) {
                val box = score.slice(score.lastIndex - m + 1 - (it * m)..score.lastIndex - (it * m))
                answer += box[0] * m
            }
        }
        return answer
    }
}