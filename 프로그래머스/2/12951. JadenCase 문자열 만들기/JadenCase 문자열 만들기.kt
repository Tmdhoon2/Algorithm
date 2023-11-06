class Solution {
    fun solution(s: String): String {
    var answer = StringBuilder()

    val list = s.split(" ").toMutableList().map { it.lowercase() }

    list.forEach {
        answer.append(it.replaceFirstChar { it.uppercaseChar() })
        answer.append(" ")
    }

    return answer.toString().removeRange(answer.lastIndex..answer.lastIndex)
}
}