class Solution {
    fun solution(s: String): String {
        val answer = StringBuilder()
        var index = 0
        s.forEach {
            if (it.toString().isBlank()) {
                answer.append(" ")
                index = 0
            } else {
                if (index % 2 == 0) {
                    answer.append(it.uppercaseChar())
                } else {
                    answer.append(it.lowercaseChar())
                }
                index++
            }
        }
        return answer.toString()
    }
}