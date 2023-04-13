class Solution {
    fun solution(s: String): String {
        var answer = ""
        val stringBuilder = StringBuilder()
        val answerList = arrayListOf<Int>()
        s.split(" ").forEach {
            answerList.add(it.toInt())
        }
        stringBuilder.append("${answerList.minOrNull()} ${answerList.maxOrNull()}")
        answer = stringBuilder.toString()
        return answer
    }
}