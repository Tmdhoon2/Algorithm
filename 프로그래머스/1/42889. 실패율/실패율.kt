class Solution {
    fun solution(N: Int, stages: IntArray): List<Int> {
        var answer = Array(N + 1) { 0 }
        stages.map { it - 1 }.forEach {
            answer[it] += 1
        }
        var max = stages.size.toDouble()
        val answers = answer.map { it.toDouble() }.toMutableList()
        answers.removeLast()
        
        val first = answers[0]
        answers[0] /= max
        max -= first
        
        (1 until answers.size).forEach {
            val temp = answers[it]
            if (max > 0) { 
                answers[it] /= max
                max -= temp
            } else {
                answers[it] = 0.0
            }
        }
        
        println(answers)
        
        return answers.mapIndexed { index, i -> i to index + 1 }.sortedByDescending { it.first }.map { it.second }
    }
}

// 6 [1, 3, 7]
// 6 [0.333, 1, ]
