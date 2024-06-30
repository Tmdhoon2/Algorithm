class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list
        if (answer[answer.size-1] > answer[answer.size - 2]) {
            answer += answer[answer.size-1] - answer[answer.size-2]
        } else {
            answer += answer[answer.size - 1] * 2
        }
        return answer
    }
}