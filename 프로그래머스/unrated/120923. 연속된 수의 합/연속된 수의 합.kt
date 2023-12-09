class Solution {
    fun solution(num: Int, total: Int): IntArray {
    var answer: IntArray = intArrayOf()

    when (num % 2) {
        0 -> {
            val start = total / num
            val end = num / 2
            for(i in (start - end+1)..(start + end)){
                answer += i
            }
        }

        else -> {
            val start = total / num
            val end = num / 2
            for(i in (start - end)..(start + end)){
                answer += i
            }
        }
    }

    return answer
}
}