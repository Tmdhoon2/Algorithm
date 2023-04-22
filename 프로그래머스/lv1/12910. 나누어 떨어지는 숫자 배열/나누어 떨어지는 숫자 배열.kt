class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        arr.forEach {
            if(it % divisor == 0) answer += it
        }
        if(answer.isEmpty()){
            answer += -1
        }
        return answer.sorted().toIntArray()
    }
}